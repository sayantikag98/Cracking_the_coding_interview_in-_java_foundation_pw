class Helper{
    static void printPositive(int[] arr){
       /*
            Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
            Output:
            2
            6
            0
            4
        */

        for(int i: arr){
            if(i>=0) System.out.println(i);
        }
    }

    static void stringsAtOddIndex(String[] str){
        /*
            Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
                strings stored on odd indices of the array.
                Output:
                bc
                de
                fg
         */

        for(int i = 1; i<str.length; i+=2){
            System.out.println(str[i]);
        }
    }

    static void printEvenElements(int[] arr){
        /*
            Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
                elements.
                Output:
                2
                4
                6
                8
         */

        for(int i: arr){
            if((i&1) == 0){
                System.out.println(i);
            }
        }
    }

    static void printMinimum(int[] arr){
        /*
            Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
                for calculating the minimum element.
                Output:
                -4
         */

        if(arr.length > 0){
            int min = arr[0];
            for(int i = 1; i<arr.length; i++){
                min = Math.min(min, arr[i]);
            }
            System.out.println(min);
        }
    }

    static void printFirstPeakEle(int[] arr){
        /*
            Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
                Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
                Leftmost and rightmost element cannot be a peak element.
                Output:
                4
         */

        for(int i = 1; i<arr.length - 1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
public class Assignment {
    public static void main(String[] args) {

        int[] arr1 = {2, 6, -5, -1, 0, 4, -9};
        Helper.printPositive(arr1);

        String[] str = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        Helper.stringsAtOddIndex(str);

        int[] arr3 = {1,2,3,4,5,6,7,8};
        Helper.printEvenElements(arr3);

        int[] arr4 = {2, -3, 5, 8, 1, 0, -4};
        Helper.printMinimum(arr4);

        int[] arr5 = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        Helper.printFirstPeakEle(arr5);

    }
}
