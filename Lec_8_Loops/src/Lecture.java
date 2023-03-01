import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = 1, n;
//        n = sc.nextInt();
//        while(num<=n){
//            System.out.println(num);
//            num++;
//        }

        // sum of n natural numbers
//        int sum = 0, nthNaturalNo = sc.nextInt();
//        while(nthNaturalNo>0){
//            sum += nthNaturalNo;
//            nthNaturalNo--;
//        }
//        System.out.println("Sum is: "+sum);

        // demo for loop 1
//        for(int i = 1; i<=10; i++){
//            System.out.println(i);
//        }
//        int i = 1, sum1 = 0;
//        for(;i<=10;){
//            System.out.println(i);
//            sum1+=i;
//            ++i;
//        }
//        System.out.println(sum1);


//        demo do while loop
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<100);

        // sum of stream of integers in the input

//        boolean wantMoreIntegers;
//        int inputNo, sumInput = 0;
//        do{
//            System.out.println("Please enter the number");
//            inputNo = sc.nextInt();
//            sumInput += inputNo;
//            System.out.println("The sum is: "+sumInput);
//            System.out.println("Do you want to continue");
//            wantMoreIntegers = sc.nextBoolean();
//        }while(wantMoreIntegers);
//
//        System.out.println("The total sum is: "+sumInput);

        //print the first multiple of 5 which is also a multiple of 7
        for(int i = 5;;i+=5){
            if(i%7==0){
                System.out.println(i);
                break;
            }
        }
    }
}
