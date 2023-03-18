import basicop.BasicOperations;

import java.util.Arrays;
import java.util.HashMap;

public class Assignment {

    static boolean noOfUniqueIntegers(int[] arr, int m){
        /*
            Using extra space
         */
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            freq.put(arr[i], i);
        }
        return freq.size() >= m;
    }

    static boolean noOfUniqueIntegersUsingSorting(int[] arr, int m){
        /*
            Using sorting and without the extra space
         */
        Arrays.sort(arr);
        int count = arr.length == 0 ? 0 : 1;
        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] != arr[i+1]) count++;
        }
        return count >= m;
    }
    public static void main(String[] args) {
        /*
            First question: Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
            greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique integer)
            Input:
            5
            10
            1 2 1 4 5 2 1 1 2 2
            Expected Output:
            false
         */
        int[] arr1 = BasicOperations.createArray();
        int m = BasicOperations.sc.nextInt();
        System.out.println(noOfUniqueIntegers(arr1, m));
        System.out.println(noOfUniqueIntegersUsingSorting(arr1, m));
    }
}
