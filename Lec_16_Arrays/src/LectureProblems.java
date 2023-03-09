import java.util.Scanner;

public class LectureProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt(), sum1 = 0;
        int[] arr1 = new int [len1];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        // add the elements of the array

        for(int i = 0; i<arr1.length; i++){
            sum1+=arr1[i];
        }

        System.out.println(sum1);

        // find maximum in the array

        int max2 = arr1[0];

        for(int i = 1; i<arr1.length; i++){
            if(max2 < arr1[i]) max2 = arr1[i];
        }

        System.out.println(max2);

        // search for a given element in the array, if present print the index else print -1

        int tar3 = sc.nextInt(), ans3 = -1;
        for(int i = 0; i<arr1.length; i++){
            if(tar3 == arr1[i]){
                ans3 = i;
                break;
            }
        }
        System.out.println(ans3);

    }

}
