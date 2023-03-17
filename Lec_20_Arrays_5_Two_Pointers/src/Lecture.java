import basicop.BasicOperations;
public class Lecture {

    static void sortArrayOfZerosAndOnesUsingCount(int[] arr){
        /*
            Technique used was to count the number of zeros
         */
        int count = 0;
        for(int i: arr){
            if(i == 0) count++;
        }
        for(int i = 0; i<arr.length; i++){
            if(count>0){
                arr[i] = 0;
                --count;
            }
            else{
                arr[i] = 1;
            }
        }
    }

    static void swapArrayElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArrayOfZerosAndOnesUsingTwoPointers(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i<j){
            // whenever the left pointer sees zero it increments and whenever the right pointer sees one it decrements
            if(arr[i] == 1 && arr[j] == 0){
                swapArrayElements(arr, i, j);
                i++;
                j--;
            }
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
        }
    }

    static void sortEvensAndOdds(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i<j){
            if((arr[i]&1)==1 && (arr[j]&1)==0){
                swapArrayElements(arr, i, j);
                i++;
                j--;
            }
            if((arr[i]&1)==0) i++;
            if((arr[j]&1)==1) j--;
        }
    }

    static int[] sortArrayElementSquares(int[] arr){
        /*
            largest absolute value among the negative numbers will be the leftmost number and the largest number among the positive
            numbers would be the rightmost number because the array is sorted in non-decreasing order.
            So the candidate for the largest absolute number among all the numbers initially would be the comparison between these
            two numbers. Whatever would be the candidate place it in the ans array and shift the pointer accordingly.

            Need not take Math.abs(arr[right]) because there can be only one condition where both arr[left] and arr[right] is negative.
            Then arr[left] <= arr[right] and then Math.abs(arr[left]) >= Math.abs(arr[right]) or Math.abs(arr[left])>=arr[right].
            Anyways for both the case (with or without Math.abs for arr[right]) the first if statement will execute and left will move forward.
         */
        int n = arr.length;
        int[] ans = new int [n];
        int left = 0, right = n - 1, k = n - 1;
        while(left<=right && k>=0){
            if(Math.abs(arr[left])>=arr[right]){
                ans[k--] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        /*
            First question: Sorting array of only 0s and 1s [no inbuilt sort should be used]
         */
        int[] arr1 = BasicOperations.createArray();
        int[] arr11 = arr1.clone();
        sortArrayOfZerosAndOnesUsingCount(arr1);
        BasicOperations.printArray(arr1);
        sortArrayOfZerosAndOnesUsingTwoPointers(arr11);
        BasicOperations.printArray(arr11);

        /*
            Second question: Given an array of integers, move all the even integers at the beginning of
            the array followed by the odd integers. Relative order of odd or even integers does not matter.
            Return any array that satisfies the condition.

            Exactly same logic as the first question
         */

        int[] arr2 = BasicOperations.createArray();
        sortEvensAndOdds(arr2);
        BasicOperations.printArray(arr2);

        /*
            Third question: Given an integer array sorted in non-decreasing order,
            return an array of the squares of each element sorted in non-decreasing
            order.
         */

        int[] arr3 = BasicOperations.createArray();
        BasicOperations.printArray(sortArrayElementSquares(arr3));

        
    }
}
