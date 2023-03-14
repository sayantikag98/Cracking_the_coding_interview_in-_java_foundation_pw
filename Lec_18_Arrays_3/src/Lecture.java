import java.util.Arrays;
import java.util.Scanner;

public class Lecture {
    static Scanner sc = new Scanner(System.in);

    static int[] createArray(){
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    static void printArrayWithinRanges(int[] arr, int start, int end){  // start included and end excluded
        for(int i = start; i<end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void targetSumPrintAllPairs(int[] arr, int targetSum){
        for(int i = 0; i<arr.length-1; i++){
            int secondNo = targetSum - arr[i];
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] == secondNo){
                    System.out.print("The pair is: "+arr[i]+" and "+arr[j]);
                    System.out.println();
                    break;
                }
            }
        }
    }

    static void targetSumPrintAllPairs2ndApproach(int[] arr, int targetSum){
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while(i<j){
            if(arr[i] + arr[j] == targetSum){
                System.out.print("The pair is: "+arr[i]+" and "+arr[j]);
                System.out.println();
                i++;
                j--;
            }
            else if(arr[i] + arr[j] > targetSum) j--;
            else i++;
        }
    }

    static int countTriplets(int[] arr, int targetSum){
        int ans = 0;
        for(int i = 0; i<arr.length - 2; i++){
            for(int j = i+1; j<arr.length - 1; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == targetSum) {
                        System.out.println("The triplets are: "+arr[i]+", "+arr[j]+" and "+arr[k]);
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int findUniqueElementApproachDiscussedByPW(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0) continue;
            boolean isAns = true;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<0) continue;
                if(arr[j] == arr[i]){
                    arr[j]*=-1;
                    isAns = false;
                    break;
                }
            }
            if(isAns) return arr[i];
        }
        return -1;
    }

    static int findUniqueElement(int[] arr){
        int xor = 0;
        for(int i: arr){
           xor^=i;
        }
        return xor;
    }

    static int secondLargestElement(int[] arr){
        int n = arr.length, largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(largest<arr[i]) largest = arr[i];
        }
        for(int i = 0; i<n; i++){
            if(secondLargest<arr[i] && arr[i] != largest) secondLargest = arr[i];
        }
        return secondLargest;
    }

    static int secondSmallestElement(int[] arr){
        int n = arr.length, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(smallest>arr[i]) smallest = arr[i];
        }
        for(int i = 0; i<n; i++){
            if(secondSmallest > arr[i] && arr[i] != smallest) secondSmallest = arr[i];
        }
        return secondSmallest;
    }

    static int firstRepeatingElement(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int lastRepeatingElement(int[] arr){
        int lastRepeatingELement = -1;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    lastRepeatingELement = arr[i];
                    break;
                }
            }
        }
        return lastRepeatingELement;
    }

    public static void main(String[] args) {
        int[] arr1 = createArray();
        int targetSum = sc.nextInt();

        /*
            The first and the second question are of the pattern: Target Sum
         */

        /*
            First question: Target sum - Find all the pairs in the given array whose sum is equal to the target sum
         */
        targetSumPrintAllPairs(arr1, targetSum);
        targetSumPrintAllPairs2ndApproach(arr1, targetSum);

        /*
            Second question: Count triplets - Count the number of triplets whose sum is equal to the target sum
         */
        System.out.println(countTriplets(arr1, targetSum));

        // ___________________________________________________________________________________________ //

        /*
            Next following questions are of the pattern: Array Manipulation
         */

        /*
            Third question: Find the unique number in the given array where all the elements except one are being repeated twice
            only positive elements are in the array
         */

        int[] arr3 = createArray();
        System.out.println(findUniqueElement(arr3));
        System.out.println(findUniqueElementApproachDiscussedByPW(arr3));

        /*
            Fourth question: Find the second largest element in the array
            [Second largest element will always be present in the array]
         */

        int[] arr4 = createArray();
        System.out.println(secondLargestElement(arr4));
        System.out.println(secondSmallestElement(arr4));

        /*
            Fifth question: Find the first repeating element in the array.If no element is repeated then return -1.
            All positive integers given in the array.
         */

        int[] arr5 = createArray();
        System.out.println(firstRepeatingElement(arr5));
        System.out.println(lastRepeatingElement(arr5));

    }
}
