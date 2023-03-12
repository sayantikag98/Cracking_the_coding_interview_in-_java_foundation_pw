import java.util.Arrays;
import java.util.Scanner;

public class LectureProblems {
    static int[] createArrayFromUserInput(Scanner sc){
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int countOccurrences(int[] arr, int x){
        /*
            Count occurrences of a particular element in the array
         */
        int count = 0;
        for(int i : arr){
            if(i == x) count++;
        }
        return count;
    }

    static int lastOccurrenceOfElement(int[] arr, int x){
        /*
            Print the last occurrence of a particular element in the array
         */
        int ind = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x) ind = i;
        }
        return ind;
    }


    static int countNoOfElementsGreaterThanX(int[] arr, int x){
        /*
            Count the number of elements in the array which is strictly greater than x
         */
        int count = 0;
        for(int i: arr){
            if(i>x) count++;
        }
        return count;
    }

    static boolean isArraySorted(int[] arr){
        /*
            Check whether the given array is sorted or not
            Assuming the sort is in ascending order
            even if the elements are equal it is considered sorted
         */
        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }

    static int[] smallestAndLargestElementArray(int[] arr){
        /*
            return the array of two size containing the first element as the smallest element and the second element being the largest element
         */
        if(arr.length == 0) return arr; // empty input array
        int[] ans = new int[2];
        ans[0] = arr[0];
        ans[1] = arr[0];
        if(arr.length > 1){
           for(int i = 1; i<arr.length; i++){
               ans[0] = Math.min(ans[0], arr[i]);
               ans[1] = Math.max(ans[0], arr[i]);
           }
        }
        return ans;

        /*
            There is another way to do the question as shown in the lecture:

            if(arr.length == 0) return arr;
            else{
                Arrays.sort(arr);
                return new int[2]{arr[0], arr[arr.length - 1]};
            }

         */
    }


    static int[] kThSmallestAndKthLargestElement(int[] arr, int k){
        /*
            Find the kth smallest and the kth largest element of the array
            assuming that the k is within the bounds of the array
         */
        if(arr.length == 0) return arr;
        else{
            Arrays.sort(arr);
            return new int [] {arr[k-1], arr[arr.length - k]};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = createArrayFromUserInput(sc);
        int x = sc.nextInt();


        /*
            First question
         */
        System.out.println(countOccurrences(arr, x));


         /*
            Second question
         */
        System.out.println(lastOccurrenceOfElement(arr, x));


         /*
            Third question
         */
        System.out.println(countNoOfElementsGreaterThanX(arr, x));


         /*
            Fourth question
         */
        System.out.println(isArraySorted(arr));


         /*
            Fifth question
         */
        int[] ans = smallestAndLargestElementArray(arr);
        if(ans.length == 0){
            System.out.println("The ans array is empty");
        }
        else{
            System.out.println("The smallest element of the array is: "+ans[0]);
            System.out.println("The largest element of the array is: "+ans[1]);
        }

         /*
            Sixth question
         */

        int k = sc.nextInt();

        int[] ans1 = kThSmallestAndKthLargestElement(arr,k);
        if(ans1.length == 0){
            System.out.println("The array is empty");
        }
        else{
            System.out.println("The "+k+"th smallest element of the array is: "+ans1[0]);
            System.out.println("The "+k+"th largest element of the array is: "+ans1[1]);
        }
    }
}
