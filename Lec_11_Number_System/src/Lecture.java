import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         // Convert binary to decimal
        (1101) base 2 = 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = (13) base 10
         */
//        int binaryNum = sc.nextInt(), sum = 0, mul = 1, temp = binaryNum;
//        while(temp > 0){
//            sum += (temp%10) * mul;
//            temp /= 10;
//            mul *= 2; // powers of 2
//        }
//        System.out.println("The decimal form of "+binaryNum+" is: "+sum);

        /*
        // Convert decimal to binary

        (13) base 10 = (1101) base 2
         */

        int decimalNum = sc.nextInt(), temp1 = decimalNum, sum1 = 0, mul1 = 1;
        while(temp1>0){
            sum1 += temp1%2 * mul1;
            mul1 *= 10; // powers of 10
            temp1/=2;
        }
        System.out.println("The binary representation of "+decimalNum+" is: "+sum1);
    }

}
