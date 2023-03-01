import java.util.Scanner;
import java.lang.Math;
public class Assignment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
            First question
            Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
            Input1:
            6
            Output1:
            1 1 2 3 5 8
            Input2:
            2
            Output2:
            1 1
         */
//        int num1 = sc.nextInt(), a = 1, b = 1, c;
//        for(int i = 0; i<num1; i++){
//            System.out.print(a+" ");
//            c = a + b;
//            a = b;
//            b = c;
//        }

        /*
            Second Question
            Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
            negative or zero. Calculate the sum of numbers until a negative number is encountered.
            If the input is a negative number, current sum is discarded and print -1.

            Input1:
            2
            48
            0
            6
            -5
            9
            7
            Output1:
            -1
            Input2:
            0
            2
            6
            1
            4
            0
            Output2:
            13
         */
//        int num2, sum = 0;
//        boolean flag = true;
//        while(sc.hasNextInt()){
//            num2 = sc.nextInt();
//            if(num2>0 && flag == true) sum+=num2;
//            else if(num2<0){
//                sum = -1;
//                flag = false;
//            }
//        }
//        System.out.println(sum);

        /*
            Third question
            Explanation:
            Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n.
            E.g.-
            4! = 1*2*3*4 = 24
            3! = 3*2*1 = 6
            Also,
            1! = 1
            0! = 0
            Input1:
            5
            Output1:
            120
            Input2:
            1
            Output2:
            1
         */

//        int num3 = sc.nextInt(), fact = 1;
//        for(int i = 1; i<= num3; i++){
//            fact *= i;
//        }
//        if(num3 == 0) System.out.println(0);
//        else System.out.println(fact);

        /*
            Fourth question
            Q4- Write a program to print all Armstrong numbers between 1 to n. (Medium)
            Explanation:
            A three digit number is called the Armstrong number if the sum of the cube of its digit is equal to the number itself.
            E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.
            Input1:
            1000
            Output1:
            0
            1
            153
            370
            371
            407
            Input2:
            500
            Output2:
            0
            1
            153
            370
            371
            407
         */

//        int num4 = sc.nextInt();
//
//        for(int i = 0; i<=num4; i++){
//            if(isArmstrong(i))
//                System.out.println(i);
//        }

        /*
            Fifth question
            Q5 – Write a program to print the cross pattern given below (in the shape of X): (Medium)
               *   *
                * *
                 *
                * *
               *   *
         */

//        int num5 = sc.nextInt();
//        int nsp1 = 0, nsp2 = num5 - 2;
//        for(int i = 1; i<= num5; i++){
//            for(int j = 1; j<= nsp1; j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 1; j <= nsp2; j++) {
//                System.out.print(" ");
//            }
//            if(i != (num5 + 1)/2) {
//                System.out.print("*");
//            }
//            if(i<=num5/2){
//                nsp1++;
//                nsp2-=2;
//            }
//            else{
//                nsp1--;
//                nsp2+=2;
//            }
//            System.out.println();
//        }

        /*
            Sixth question
            Q6- Write a program to print alphabet diamond pattern: (Hard)
                    A
                   ABC
                  ABCDE
                 ABCDEFG
                ABCDEFGHI
                 ABCDEFG
                  ABCDE
                   ABC
                    A
         */
//        int num6 = sc.nextInt(), nsp = num6/2, val = 1;
//        for(int i = 1; i<= num6; i++){
//            for(int j = 1; j<=nsp; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<= val; j++){
//                System.out.print((char)(j+64));
//            }
//            if(i <= num6/2){
//                nsp--;
//                val+=2;
//            }
//            else{
//                nsp++;
//                val-=2;
//            }
//            System.out.println();
//        }
//

        /*
            Seventh question
            Q7- Write a program to print pattern given below : (Medium)
                      *
                      *
                    *****
                      *
                      *
         */

//        int num7 = sc.nextInt();
//        for(int i = 1; i<=num7; i++){
//            for(int j = 1; j<= num7; j++){
//                if((i != (num7+1)/2 && j == (num7+1)/2)||(i == (num7+1)/2)){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        /*
             Eighth question

             Q8 - Write a program to print a triangle of prime numbers upto given number of lines of the trinagle.
             Input1:
                2
            Output1:
                    2
                   3 5
             Input2:
                6
             Output2:
                    2
                   3 5
                 7 11 13
               17 19 23 29
             31 37 41 43 47
            53 59 61 67 71 73
         */









    }

    static boolean isArmstrong(int num){
        int temp = num, sum = 0;

        while(temp>0){
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }

        if(sum == num) return true;
        else return false;
    }
}
