import java.util.Scanner;
import java.util.Arrays;

public class Assignment {

    static Scanner sc = new Scanner(System.in);

    static int[] createArray(){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static int[] allNegEleAtLast(int[] arr){
        /*
            Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
                all negative elements at the end of array without changing the order of positive elements
                and negative elements
                Input1 :
                N = 8
                arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
                Output1 :
                1 3 2 11 6 -1 -7 -5

                Input2:
                N = 4
                arr[] = {-3, -1, 0, -7}
                Output1:
                0 -3 -1 -7
         */
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=0 && i>0){
                int j = i;
                while(j>0 && arr[j-1]<0){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }
        }
        return arr;
    }

    static void mergeDistinctElements(int[] arr1, int[] arr2){
        /*
            Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
                union between these two arrays and print the number of elements of the union set.
                Union of the two arrays can be defined as the set containing distinct elements from both
                the arrays. If there are repetitions, then only one occurrence of element should be printed
                in the union.

                Input1:
                5 3
                1 2 3 4 5
                1 2 3
                Output1:
                5

                Input2:
                2 2
                1 1
                4 4
                Output2:
                2
         */
        int[] ans = new int [arr1.length + arr2.length];
        int k = 0, i = 0, j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                if(arr1[i] == arr2[j]) j++;
                ans[k++] = arr1[i++];
            }
            else
                ans[k++] = arr2[j++];
        }

        while(i<arr1.length)
            ans[k++] = arr1[i++];


        while(j<arr2.length)
            ans[k++] = arr2[j++];

        System.out.println("The total number of elements in the merged array with distinct elements is: "+k);
        for(int y = 0; y<k; y++){
            System.out.print(ans[y]+" ");
        }
        System.out.println();
    }

    static int kThSamllestEle(int[] arr, int k){
        /*
            Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to
                find the Kth smallest element in the given array. It is given that all array elements are
                distinct.

                Input1:
                N = 6
                arr[] = 7 10 4 3 20 15
                K = 3
                Output1:
                7
         */
        if(arr.length == 0) return -1;
        Arrays.sort(arr);
        return arr[k-1];
    }

    static void subArrayOfParticularSum(int[] arr, int targetSum){
        /*
        Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a
            continuous sub-array which adds to a given number S.
            In case of multiple subarrays, return the subarray which comes first on moving from left
            to right.
            You need to print the start and end index of answer subarray.

            Input1:
            N = 5, S = 12
            A[] = {1,2,3,7,5}
            Output1:
            2 4

            Input2:
            N = 5, S = 5
            A[] = {1,2,3,7,5}
            Output2:
            2 3
         */

        // At first find the prefix sum
        int[] prefixSum = new int [arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }


        int lastIndex = -1, firstIndex = -1;
        // lastIndex is included in the range for subarray but the firstIndex is not included


        // lastIndex is the index value which is present in the prefix sum exactly equal to the targetsum or greater than the prefix sum
        for(int i = 0; i<prefixSum.length; i++){
            if(targetSum <= prefixSum[i]){
                lastIndex = i;
                break;
            }
        }

        if(lastIndex != -1){
            int remValue = prefixSum[lastIndex] - targetSum;

            // firstIndex is the index value in the prefix sum which is the excess of the target sum
            if(remValue != 0){
                for(int i = 0; i<lastIndex; i++){
                    if(prefixSum[i] == remValue){
                        firstIndex = i;
                        break;
                    }
                }
            }
        }


        if(firstIndex != -1 && lastIndex != -1){
            // get the sub array from the firstIndex + 1 till the lastIndex
            System.out.println("The subarray is: ");
            for(int i = firstIndex+1; i<=lastIndex; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("The range is: "+(firstIndex+2)+" and "+(lastIndex+1));
        }
    }

    static void subArraySumEqualTargetSum2ndApproach(int[] arr, int targetSum){
        int firstIndex = -1, lastIndex = -1;

        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(sum >= targetSum){
                lastIndex = i;
                for(int j = 0; j<i; j++){
                    sum -= arr[j];
                    if(sum == targetSum){
                        firstIndex = j;
                        break;
                    }
                }
                break;
            }
        }

        if(firstIndex != -1 && lastIndex != -1){
            for(int i = firstIndex + 1; i<=lastIndex; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("The range is: "+(firstIndex+2)+" and "+(lastIndex+1));
        }
    }

    static boolean equalityOfTwoArrays(int[] arr1, int[] arr2) {
        /*
            Q5 - Write a Java program to test the equality of two arrays.
            Input1:
            2 5 7 9 11
            2 5 7 9 13
            Output1:
            false

            Input2:
            2 5 7 9 12
            2 5 7 9 12
            Output2:
            true
         */
        if(arr1.length != arr2.length) return false;

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }


    public static void main(String[] args) {

        /*
            First question
         */

        int[] arr = createArray();
        int[] ans = allNegEleAtLast(arr);
        printArray(ans);

        /*
            Second question
         */
        int[] arr21 = createArray();
        int[] arr22 = createArray();
        mergeDistinctElements(arr21, arr22);

        /*
            Third question
         */

        int[] arr3 = createArray();
        int k = sc.nextInt();
        System.out.println("The kth samllest element is: "+kThSamllestEle(arr3, k));

        /*
            Fourth question
         */

        int[] arr4 = createArray();
        int targetSum = sc.nextInt();
        subArrayOfParticularSum(arr4, targetSum);
        subArraySumEqualTargetSum2ndApproach(arr4, targetSum);

        /*
            Fifth question
         */

        int[] arr51 = createArray();
        int[] arr52 = createArray();

        System.out.println(equalityOfTwoArrays(arr51, arr52));
    }


}
