import basicop.BasicOperations;

import java.util.Arrays;
import java.util.HashMap;

public class Assignment {

    /**
     * Question: Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
     * greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique integer
     * <br><br>
     * Input:
     * <br>
     * 5
     * <br>
     * 10
     * <br>
     * 1 2 1 4 5 2 1 1 2 2
     * <br><br>
     * Expected Output:
     * <br>
     * false
     * <hr>
     * This method uses extra space
     * <br><br>
     * TC => O(n)
     * <br>
     * SC => O(n)
     * <br><br>
     * @param arr the given array
     * @param m   the unique count has to be greater than or equal to this number for it to return true
     * @return    true if the unique count is greater than or equal to m otherwise false
     */


    static boolean noOfUniqueIntegers(int[] arr, int m){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            freq.put(arr[i], i);
        }
        return freq.size() >= m;
    }

    /**
     * Question: Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
     * greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique integer)
     * <br><br>
     * Input:
     * <br>
     * 5
     * <br>
     * 10
     * <br>
     * 1 2 1 4 5 2 1 1 2 2
     * <br><br>
     * Expected Output:
     * <br>
     * false
     * <hr>
     * This method uses sorting and no the extra space
     * <br><br>
     * TC => O(n*logn)
     * <br>
     * SC => O(1)
     * <br><br>
     * @param arr the given array
     * @param m   the unique count has to be greater than or equal to this number for it to return true
     * @return    true if the unique count is greater than or equal to m otherwise false
     */
    static boolean noOfUniqueIntegersUsingSorting(int[] arr, int m){
        Arrays.sort(arr);
        int count = arr.length == 0 ? 0 : 1;
        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] != arr[i+1]) count++;
        }
        return count >= m;
    }

    /**
     * Question: Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
     * greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique integer)
     * <br><br>
     * Input:
     * <br>
     * 5
     * <br>
     * 10
     * <br>
     * 1 2 1 4 5 2 1 1 2 2
     * <br><br>
     * Expected Output:
     * <br>
     * false
     * <hr>
     * This method have a pointer that traverse through all the unique elements in the sorted array by using nested loop
     * and get the count from there.
     * <br><br>
     * TC => O(n*logn)
     * <br>
     * SC => O(1)
     * <br><br>
     * @param arr the given array
     * @param m   the unique count has to be greater than or equal to this number for it to return true
     * @return    true if the unique count is greater than or equal to m otherwise false
     */
    static boolean noOfUniqueElementsUsingSortingAndNestedLoop(int[] arr, int m){
        Arrays.sort(arr); //inplace sort
        int j = 0, i = 0, count = 0;
        while(j<arr.length){
            count++;
            while(i<arr.length && arr[i] == arr[j]){  // here checking whether i is within the bounds of the array is imp
                i++;
            }
            j = i;
        }
        return count >= m;
    }

    /**
     * Question:
     * Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.
     * <br><br>
     * Input:
     * <br>
     * 3
     * <br>
     * 1 3 5
     * <br><br>
     * Expected Output:
     * <br>
     * 4
     * <hr><br>
     * This method nested loop to get all the subarrays and then subsequently adding the numbers in them
     * to get the sum. At last check if the sum is odd or not, if it is then increase the count.
     * <br><br>
     * TC => O(n^2)
     * <br>
     * SC => O(1)
     * <br><br>
     * @param arr the given array
     * @return number of subarrays with odd sum
     */
    static int noOfSubArrayWithOddSumUsingNestedLoop(int[] arr){
        int count = 0, sum;
        for(int j = 0; j<arr.length; j++){
            sum = 0;
            for(int i = j; i<arr.length; i++){
                sum+=arr[i];
                if((sum&1)==1) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        /*
            First question
         */
        int[] arr1 = BasicOperations.createArray();
        int m = BasicOperations.sc.nextInt();
        System.out.println(noOfUniqueIntegers(arr1, m));
        System.out.println(noOfUniqueIntegersUsingSorting(arr1, m));
        System.out.println(noOfUniqueElementsUsingSortingAndNestedLoop(arr1, m));

        /*
            Second question
         */
        int[] arr2 = BasicOperations.createArray();
        System.out.println(noOfSubArrayWithOddSumUsingNestedLoop(arr2));
    }
}
