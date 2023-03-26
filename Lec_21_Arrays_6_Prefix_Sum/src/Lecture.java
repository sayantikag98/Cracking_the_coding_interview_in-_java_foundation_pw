import arraybasicop.BasicOp;

public class Lecture {

    /**
     * Question:
     * Given an array find the prefix sum.
     * <br><br>
     * Input:
     * <br>
     * 4
     * <br>
     * 1 3 2 1
     * <br><br>
     * Expected Output:
     * <br>
     * 1 4 6 7
     * <hr><br>
     * prefixSum[i] = prefixSum[i-1] + arr[i]
     * <br><br>
     * TC => O(n)
     * <br>
     * SC => O(1)
     * <br><br>
     *
     * @param arr the input array
     * @return the prefix sum array
     */
    static int[] calcPrefixSum(int[] arr){
        for(int i = 1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    /**
     * Question:
     * Given an array of integers of size n. Answer q queries where you need to print the sum
     * of values in a given range of indices from l to r (both included).
     * Note: The values of l and r in queries follow 1 based indexing.
     * <br><br>
     * Input:
     * <br>
     * n = 5 <br>
     * arr = 2 4 1 3 6 <br>
     * q = 3 <br>
     * l = 2, r = 4 <br>
     * l = 1, r = 5 <br>
     * l = 1, r = 3
     * <br><br>
     * Expected Output:
     * <br>
     * 8 <br>
     * 16 <br>
     * 7
     * <hr><br>
     * Brute Force: Iterate the array q times and get the sum within the range then TC = O(nq) <br>
     * Prefix sum reduce the time complexity by O(n) + O(q) ~ O(n) or O(q) whichever is greater <br>
     * if(l>=2) sum = arr[r-1] - arr[l-2] <br>
     * otherwise sum = arr[r-1]
     * <br><br>
     * TC => O(n) + O(q) where n is the length of the array and q is the number of queries
     * <br>
     * SC => O(1)
     * <br><br>
     *
     * @param arr the prefix sum array
     * @param l the starting range
     * @param r the ending range
     * @return the sum of the values in the range from l to r
     */

    static int queryRangeSum(int[] arr, int l, int r){
        if(l==1) return arr[r-1];
        else return arr[r-1] - arr[l-2];
    }

    /**
     * Question:
     * Check if we can partition the array into two subarrays with equal sum. More formally, check
     * that the prefix sum of a part of the array is equal to the suffix sum of the rest of the array.
     * <br><br>
     * Input 1:
     * <br>
     * n=6 <br>
     * arr = [5, 3, 2, 6, 3, 1]
     * <br><br>
     * Expected Output:
     * <br>
     * true
     * <br><br>
     * Input 2:
     * <br>
     * n=5 <br>
     * arr = [1, 3, 2, 4, 5]
     * <br><br>
     * Expected Output:
     * <br>
     * false
     * <hr><br>
     * First get the prefix sum array, then iterate through that prefix sum array and for every i
     * check whether prefixSum[i] == prefixSum[n-1] - prefixSum[i]
     * <br><br>
     * TC => O(n) where n is the length of the array
     * <br>
     * SC => O(1)
     * <br><br>
     * @param arr the given input array
     * @return true if the array can be partitioned into two equal sum subarray otherwise false
     */

    static boolean partitionSubArrayWithEqualSum(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            arr[i] += arr[i-1];
        }
        for(int i = 0; i<n-1; i++){
            if(arr[i] == arr[n-1] - arr[i]) return true;
        }
        return false;
    }

    /**
     * Question:
     * Given an array find the suffix sum.
     * <br><br>
     * Input:
     * <br>
     * 4
     * <br>
     * 1 3 2 1
     * <br><br>
     * Expected Output:
     * <br>
     * 7 6 3 1
     * <hr><br>
     * suffixSum[i] = suffixSum[i+1] + arr[i]
     * <br><br>
     * TC => O(n)
     * <br>
     * SC => O(1)
     * <br><br>
     *
     * @param arr the input array
     * @return the suffix sum array
     */

    static int[] calcSuffixSum(int[] arr){
        int n = arr.length;
        for(int i = n-2; i>=0; i--){
            arr[i] += arr[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        /*
            First question
         */
        int[] arr = BasicOp.createArray();
        int[] prefixSumArray = calcPrefixSum(arr);
        BasicOp.printArray(prefixSumArray);

        /*
            Second question
         */
        int[] arr1 = BasicOp.createArray();
        int query = BasicOp.sc.nextInt(),l,r;
        for(int i = 1; i<arr1.length; i++){
            arr1[i] += arr1[i-1];
        }
        while(query-->0){
            l = BasicOp.sc.nextInt();
            r = BasicOp.sc.nextInt();
            System.out.println(queryRangeSum(arr1, l, r));
        }

        /*
            Third question
         */
        int[] arr2 = BasicOp.createArray();
        System.out.println(partitionSubArrayWithEqualSum(arr2));

        /*
            Fourth question
         */
        int[] arr3 = BasicOp.createArray();
        BasicOp.printArray(calcSuffixSum(arr3));
    }
}
