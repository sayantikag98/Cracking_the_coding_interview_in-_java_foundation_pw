import java.util.Arrays;

public class Lecture {

    static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr){
        arr[0] = -1;
    }
    public static void main(String[] args) {
        int[] arr = new int [5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }

        int[] arr_2 = arr;
        System.out.println("Before calling the method");
        printArray(arr);
        printArray(arr_2);
        changeArray(arr);
        System.out.println("After calling the method");
        printArray(arr);
        printArray(arr_2);

        int[] arr_3 = arr.clone();
        System.out.println("Before change");
        printArray(arr);
        printArray(arr_2);
        printArray(arr_3);
        arr[2] = 100;
        System.out.println("After change");
        printArray(arr);
        printArray(arr_2);
        printArray(arr_3);

        int[] arr_4 = new int [5];
        printArray(arr_4);

        int[] arr_5 = Arrays.copyOf(arr, 3);
        printArray(arr_5);

        int[] arr_6 = Arrays.copyOfRange(arr, 0, 3);
        printArray(arr_6);



    }
}
