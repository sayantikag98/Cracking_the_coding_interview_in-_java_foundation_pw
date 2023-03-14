import java.util.Scanner;

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

    static void printArrayInRanges(int[] arr, int startIndex, int endIndex){
        // startIndex included but endIndex excluded
        for(int i = startIndex; i<endIndex; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static String absoluteDifferencePair(int[] arr, int absDiff){
        /*
                Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a
                pair in the array whose absolute difference is exactly x.(n>1)

                Input1:
                N = 5
                Arr[] = [5,10,15,20,26]
                x= 10
                Output1:
                Yes

                Input2:
                N = 7
                Arr[] = [1, 2, 3, 4, 5, 6, 7]
                x= 0
                Output2:
                No
         */
        int n = arr.length, i = 0, j = 1;
        while(i<n && j<n){
            if(Math.abs(arr[j] - arr[i]) == absDiff){
                System.out.println("The pair is: "+arr[i]+" and "+arr[j]);
                return "Yes";
            }
            else if(Math.abs(arr[j] - arr[i]) < absDiff) j++;
            else if(Math.abs(arr[j] - arr[i]) > absDiff) i++;
        }

        return "No";
    }

    static int totalOccurrences(int[] arr, int x){
        /*
            Q2 - Given an array of size n, find the total number of occurrences of given number x.

                Input1:
                n = 7
                arr[] = [3, 5, 0, 7, 8, 3, 0]
                x = 0
                Output1:
                2

                Input2:
                n = 6
                arr[] = [1, 2, 0, 8, 6, 8]
                x = 3
                Output2:
                0
         */

        int count = 0;
        for(int i: arr){
            if(i == x) count++;
        }
        return count;
    }

    static int findMissingNoInRange(int[] arr){
        /*
                Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
                missing number from the first N integers. There are no duplicates in the list.

                Input1:
                n = 8
                arr[] = {1, 2, 4, 6, 3, 7, 8}
                Output1:
                5

                Input2:
                n = 5
                arr[] = {1, 2, 3, 5}
                Output2:
                4
         */

        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(Math.abs(arr[i]) - 1 < n) arr[Math.abs(arr[i]) - 1] *= -1;
        }
        for(int i = 0; i<n; i++){
            if(arr[i]>0) return i+1;
        }
        return n+1;
    }
    public static void main(String[] args) {

        /*
            First Question
         */

        int[] arr1 = createArray();
        int absDiff = sc.nextInt();
        System.out.println(absoluteDifferencePair(arr1, absDiff));

        /*
            Second Question
         */

        int[] arr2 = createArray();
        int x = sc.nextInt();
        System.out.println(totalOccurrences(arr2, x));

        /*
            Third Question
         */
        int n = sc.nextInt();
        int[] arr3 = new int [n-1];
        for(int i = 0; i<arr3.length; i++){
            arr3[i] = sc.nextInt();
        }
        System.out.println(findMissingNoInRange(arr3));
    }
}
