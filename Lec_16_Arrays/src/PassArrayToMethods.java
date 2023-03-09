public class PassArrayToMethods {
    public static void main(String[] args) {
        int[] arr = new int [5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }

        demoFunc(arr);
    }

    static void demoFunc(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
