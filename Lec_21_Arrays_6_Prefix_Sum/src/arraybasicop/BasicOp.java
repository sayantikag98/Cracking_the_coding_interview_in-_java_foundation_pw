package arraybasicop;
import java.util.Scanner;

public class BasicOp {

    public static Scanner sc = new Scanner(System.in);

    public static int[] createArray(){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
