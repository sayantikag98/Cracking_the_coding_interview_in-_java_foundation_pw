
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // First Question: Count the number of digits in a given number n

        // it is a good practice that given input is not changed
//        int inputNo = sc.nextInt(), count = 0;
////        while(inputNo > 0){
////            count++;
////            inputNo/=10;
////        }
//        for(int i = inputNo; i>0; i/=10){
//            ++count;
//        }
//        System.out.println("The number of digits: "+count);

        // Second Question: Sum of the digits of a number
//        int sum = 0, givenNo = sc.nextInt(), temp = givenNo;
//        while(temp>0){
//            sum+=temp%10;
//            temp/=10;
//        }
//        System.out.println("The sum of the digits of "+givenNo+" is: "+sum);

        //Third Question: Reverse the number
//        int noToBeReversed = sc.nextInt(), reversedNo = 0, temp = noToBeReversed;
//
//        while(temp>0){
//            reversedNo = reversedNo * 10 + temp%10;
//            temp/=10;
//        }
//        System.out.println("The original no is: "+noToBeReversed);
//        System.out.println("The reversed no is: "+reversedNo);

        //Fourth Question: Sum of the series
//        int nNum = sc.nextInt(), sumSeries = 0;
//        for(int i = 1; i<=nNum; ++i){
//            if((i&1) == 1) sumSeries+=i;
//            else sumSeries-=i;
//        }
//        System.out.println(sumSeries);

        //Fifth Question: first n numbers factorial
//        int factLimit = sc.nextInt();
//        long fact = 1;
//        for(int i = 1; i<=factLimit; ++i){
//            fact*=i;
//            System.out.println(fact);
//        }

        //Sixth Question: given two numbers a and b calculate a^b
        int base = sc.nextInt(), exp = sc.nextInt(), power = 1;
        for(int i = 1; i<=exp; ++i){
            power *= base;
        }
        System.out.println(base + " to the power "+ exp + " is: "+power);
    }
}
