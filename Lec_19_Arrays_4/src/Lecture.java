import basicarrayop.BasicOperations;

public class Lecture {

    static void swapUsingTemporaryVariable(int a, int b){
        /*
            Swap using the temporary variable temp
         */
        System.out.println("Before swap: a => "+a+", b => "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a => "+a+", b => "+b);
    }

    static void swapWithoutTempVariable(int a, int b){
        /*
            Swap without using the temporary variable temp
         */
        System.out.println("Before swap:a => "+a+", b => "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a => "+a+", b => "+b);
    }

    static void swapArrayElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        /*
            Reverse the given array
         */
        System.out.println("The array before reversing:");
        BasicOperations.printArray(arr);
        int n = arr.length;
        if(n == 0 || n == 1){
            System.out.println("The array after reversing:");
            BasicOperations.printArray(arr);
            return;
        }

        // either use for or while loop
//        for(int i = 0; i<=(n-1)/2; i++){
//            // swap arr[i] & arr[n-i-1]
//           int temp = arr[i];
//           arr[i] = arr[n-i-1];
//           arr[n-i-1] = temp;
//        }

        int i = 0, j = n-1;
        while(i<j){
            //swap arr[i] and arr[j]
            swapArrayElements(arr, i, j);
            i++;
            j--;
        }
        System.out.println("The array after reversing:");
        BasicOperations.printArray(arr);
    }

    static void rotateArrayByKStepsUsingExtraSpace(int[] arr, int k){
        /*
            Rotate the given array by k steps [k is a non-negative number and it can be greater than n]
            This approach uses extra space
         */
        int n = arr.length;
        k%=n;
        if(k == 0) return;
        int[] sub;

        if(k>n/2){
            sub = new int [n-k];
            /*
                arr = [1 2 3 4 5]   k = 3
                first for loop is to store sub, sub = [1 2]
                second for loop is to shift the last three elements in the array to the left by n-k steps, arr = [3 4 5 4 5]
                third for loop is to place the elements stored in sub at the end of arr, arr = [3 4 5 1 2]
             */
            for(int i = 0; i<n-k; i++){
                sub[i] = arr[i];
            }
            for(int i = 0; i<k; i++){
                arr[i] = arr[n-k+i];
            }

            for(int i = k; i<n; i++){
                arr[i] = sub[i-k];
            }

        }
        else{
            sub = new int [k];
            /*
                arr = [1 2 3 4 5]   k = 2
                first for loop is to store sub, sub = [4 5]
                second for loop is to shift the first three elements in the array to the right by k steps, arr = [1 2 1 2 3]
                third for loop is to place the elements stored in sub at the front of the arr, arr = [4 5 1 2 3]
             */

            for(int i = 0; i<k; i++){
                sub[i] = arr[n-k+i];
            }

            /*
                In the second for loop below start shifting elements from the right to left and not otherwise
                arr = [1 2 3 4 5]   k = 2
                step 1 => arr = [1 2 3 4 3]  place arr[2] in arr[4]
                step 2 => arr = [1 2 3 2 3]  place arr[1] in arr[3]
                step 3 => arr = [1 2 1 2 3]  place arr[0] in arr[2]

                step 1, 2 and 3 has to be followed in that order otherwise arr would become
                arr = [1 2 1 2 1] which is wrong
             */

            for(int i = 0; i<n-k; i++){
               arr[n-1-i] = arr[n-1-i-k];
            }

            for(int i = 0; i<k; i++){
                arr[i] = sub[i];
            }
        }
    }

    static void rotateArrayByKStepsWithoutExtraSpace(int[] arr, int k){
        /*
            Rotate array by k steps
            more optimized approach without using extra space in three steps
            arr = [1 2 3 4 5]  k = 2
            step 1: reverse the whole array (arr = [5 4 3 2 1])
            step 2: reverse the part of the array from index 0 to k-1 (both inclusive) (arr = [4 5 3 2 1])
            step 3: reverse the latter part of the array from index k to n-1 (both inclusive) (arr = [4 5 1 2 3])
         */
        int n = arr.length;
        k%=n;
        reverseArrayWithinARange(arr, 0, n-1);
        reverseArrayWithinARange(arr, 0, k-1);
        reverseArrayWithinARange(arr, k, n-1);
    }

    static void reverseArrayWithinARange(int[] arr, int startIndex, int endIndex){
        /*
            Reverse an array within the range from startIndex to endIndex (both inclusive)
         */
        while(startIndex<endIndex){
            // swap arr[startIndex] and arr[endIndex]
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    static void countFrequency(int[] arr, int[] freq){
        BasicOperations.printArray(freq);
        for(int i: arr){
            freq[i]++;
        }
    }

    static String isNumberPresent(int num, int[] freq){
        if(freq[num] == 0) return "NO";
        else return "YES";
    }
    public static void main(String[] args) {
        /*
            First and Second question
         */
        int a1 = BasicOperations.sc.nextInt(), b1 = BasicOperations.sc.nextInt();
        swapUsingTemporaryVariable(a1, b1);
        swapWithoutTempVariable(a1, b1);

        /*
            Third question
         */

        int[] arr3 = BasicOperations.createArray();
        reverseArray(arr3);

        /*
            Fourth question
         */

        int[] arr4 = BasicOperations.createArray();
        int k = BasicOperations.sc.nextInt();
        int[] arr41 = arr4.clone();
        rotateArrayByKStepsUsingExtraSpace(arr4, k);
        BasicOperations.printArray(arr4);
        rotateArrayByKStepsWithoutExtraSpace(arr41, k);
        BasicOperations.printArray(arr41);

        /*
            Fifth question

            For the given number of queries find whether the given number is present in the array or not
            Hint: All numbers in the array are less than 10^5.

            In the question we use frequency array concept

            Here making frequency array was possible because of the hint given that all the numbers in the array are less than 10^5
            so make a frequency array of size 10^5 + 5
            make the size of the frequency array slightly greater than 10^5 given in the question
         */

        int[] arr5 = BasicOperations.createArray();
        int[] freq = new int [(int)10e5 + 5];  // cast has higher precedence than addition operator
        countFrequency(arr5, freq);
        int query = BasicOperations.sc.nextInt();
        while(query>0){
            int num = BasicOperations.sc.nextInt();
            System.out.println(isNumberPresent(num, freq));
            query--;
        }


    }
}
