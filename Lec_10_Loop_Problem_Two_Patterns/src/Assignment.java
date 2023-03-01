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

//        int num8 = sc.nextInt(), nsp = num8 - 1, val = 2;
//        for(int i = 1; i<= num8; i++){
//            for(int j = 1; j<= nsp; j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print(val+"   ");
//                val = primeNum(val);
//            }
//            nsp--;
//            System.out.println();
//        }

        /*
            Ninth question
            Q9- Write a program to check whether a prime Number can be expressed as a Sum of Two
            Prime Numbers.
            Input1:
            13
            Output1:
            True
            Input2:
            2
            Output2:
            False

            Hint: Apart from 2, all of the prime numbers are odd. So it is not possible to represent a prime number
            (which is odd) to be written as a sum of two odd prime numbers, so we are sure that one of the two
            prime numbers should be 2. So we have to check whether n-2 is prime or not.
         */

//        int num9 = sc.nextInt(), i = 2;
//        boolean ans = false;
//        while(i<num9-1){
//            if(checkIsPrime(num9 - i)){
//                ans = true;
//                break;
//            }
//            i = primeNum(i);
//        }
//        System.out.println(ans);

        /*
            Tenth question
            Q10- You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the
            circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled,
            in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on
            after n fluctuations.
            Take as input a number n, representing the number of bulbs.
            Print all the bulbs that will be on after the nth fluctuation in voltage.

            //only those bulbs will remain on which are perfect
            squares as perfect squares have odd number of divisors due to their square root being
            the extra one, whereas rest have even number of divisors

            (Medium)

            Input1:
            10
            Output1:
            1 4 9
            Input2:
            25
            Output2:
            1 4 9 16 25
         */

        int num10 = sc.nextInt(), i = 1;
        while(true){
            if(i*i <= num10) System.out.println(i*i);
            else break;
            i++;
        }

    }

    // Given a prime this function will return the next prime
    static int primeNum(int prevPrime){
        int i = prevPrime + 1;
        while(true){
            boolean isPrime = checkIsPrime(i);
            if(!isPrime) i++;
            else break;
        }
        return i;
    }

    static boolean checkIsPrime(int num){
        boolean isPrime = true;
        for(int j = 2; j<num; j++){
            if(num%j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // check whether a number is armstrong or not
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
