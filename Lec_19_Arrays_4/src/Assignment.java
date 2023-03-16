

import basicarrayop.BasicOperations;

import java.util.ArrayList;
import java.util.HashMap;

public class Assignment {

    static int firstRepeatingElementUsingNestedLoops(int[] arr){
        /*
            Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
                once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
                (Assume 1 based indexing)

                Input 1:
                n = 7
                arr[] = {1, 5, 3, 4, 3, 5, 6}
                Output 1:
                2

                Input 2:
                n = 4
                arr[] = {2, 5, 3, 4}
                Output 2:
                -1
         */
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[j] == arr[i]) return i+1;
            }
        }
        return -1;
    }

    static int firstRepeatingElementWithoutNestedLoopAndExtraSpace(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> lastRepeatingIndex = new HashMap<>();
        for(int i = 0; i<n; i++){
            lastRepeatingIndex.put(arr[i], i+1);
        }
        for(int i = 0; i<n; i++){
            if(lastRepeatingIndex.get(arr[i]) != i+1) return i+1;
        }
        return -1;
    }

    static void arrangeArrayInSpecificOrder(int[] arr){
        /*
                Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
                    every positive number is followed by a negative and vice-versa maintaining the order of appearance.
                    The number of positive and negative numbers need not be equal. Begin with a negative number.
                    If there are more positive numbers, they appear at the end of the array. If there are more negative
                    numbers, they too appear at the end of the array.

                    Input 1:
                    N = 6
                    arr[] = {1, 2, 3, -4, -1, 4}
                    Output 1:
                    arr[] = {-4, 1, -1, 2, 3, 4}

                    Input 2:
                    N = 4
                    arr[] = {1, 2, 3, -4}
                    Output 2:
                    arr[] = {-4, 1, 2, 3}
         */

        int i = 0, j = 0, n = arr.length;
        // i will be iterating over all the positive numbers and j will be iterating over all the negative numbers 
        while(i<n && j<n){
            if(arr[i]>=0 && arr[j]<0){
                int temp, k;
                /*
                 the first if condition(i<j) => this is when the negative number is far ahead of the positive number
                 and we have to place the negative number and then the positive number
                 eg: the array is arr = [4 6 7 -6] arr[i] = 4 and arr[j] = -6
                    we have to make the array like arr = [-6 4 6 7] arr[i] = 4 and arr[j] = -6
                 */
                if(i<j){
                    temp = arr[j];
                    k = j - 1;
                    while(k>=i){
                        arr[k+1] = arr[k];
                        k--;
                    }
                    arr[i] = temp;
                    // changing the index of i and j is imp
                    j = i;
                    i++;
                }
                /*
                the second if condition(j<i) => this is when the positive number is far ahead of the negative number
                and we have to place the positive number just after the negative number
                eg: the array is arr = [-4 -5 -6 7] arr[i] = 7 and arr[j] = -4
                    we have to make the array like arr = [-4 7 -5 -6] arr[i] = 7 and arr[j] = -4
                 */
                else{
                    temp = arr[i];
                    k = i - 1;
                    while(k>j){
                        arr[k+1] = arr[k];
                        k--;
                    }
                    arr[j+1] = temp;
                    // changing the index of i and j is imp
                    i = j+1;
                }
                i++;
                j++;
            }
            else if(arr[i]<0) i++;
            else if(arr[j]>=0) j++;
        }
    }

    static int minimumPlatforms(int[] arr, int[] dep){
        /*
            Q3. Minimum Platforms
                Given arrival and departure times of all trains that reach a railway station. Find the minimum number
                of platforms required for the railway station so that no train is kept waiting.
                Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure
                time can never be the same for a train but we can have arrival time of one train equal to departure time
                of the other. At any given instance of time, same platform can not be used for both departure of a train
                and arrival of another train. In such cases, we need different platforms.

                Input 1:
                n = 6
                arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
                dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
                Output 1:
                3

                Input 2:
                n = 2
                arr[] = {0900, 0940
                dep[] = {0910, 1200}
                Output 2:
                1
         */

           int count = 0;
           ArrayList<Integer> platformEngagedTime = new ArrayList<>();
           for(int i = 0; i<arr.length; i++){
               if(isPlatformFree(platformEngagedTime, arr[i]) != -1){
                   int freePlatformNo = isPlatformFree(platformEngagedTime, arr[i]);
                   platformEngagedTime.set(freePlatformNo, dep[i]);
               }
               else{
                   count++;
                   platformEngagedTime.add(dep[i]);
               }
           }
           return count;
    }

    static int isPlatformFree(ArrayList<Integer> platformEngagedTime, int arrivalTime){
        for(int i = 0; i<platformEngagedTime.size(); i++){
            if(platformEngagedTime.get(i)<=arrivalTime) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        /*
            First question
         */

        int[] arr1 = BasicOperations.createArray();
        System.out.println(firstRepeatingElementUsingNestedLoops(arr1));
        System.out.println(firstRepeatingElementWithoutNestedLoopAndExtraSpace(arr1));

        /*
            Second question
         */
        int[] arr2 = BasicOperations.createArray();
        System.out.println("The array before arranging:");
        BasicOperations.printArray(arr2);
        arrangeArrayInSpecificOrder(arr2);
        System.out.println("The array after arranging:");
        BasicOperations.printArray(arr2);

        /*
            Third question
         */
        int[] arr3 = BasicOperations.createArray();
        int[] dep3 = BasicOperations.createArray();
        System.out.println(minimumPlatforms(arr3, dep3));
    }
}
