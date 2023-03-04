import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            First question
            Q1 - Convert a decimal number into binary
            Input1:
            56
            Output1:
            111000
            Input2:
            163
            Output2:
            10100011
         */
        int decNum = sc.nextInt();
        System.out.println(decimalToBinary(decNum));

        /*
            Second question
            Q2 - Convert a binary number to decimal
            Input1:
            10100011
            Output1:
            163
            Input2:
            100011
            Output2:
            35
         */

        int binNum = sc.nextInt();
        System.out.println(binaryToDecimal(binNum));

        /*
            Third question
            Q3 - Add two numbers given in different base
            Input1: 1st number is decimal, 2nd number is binary
            43
            10100011
            Output1: In decimal number
            206
            Input2:
            35
            111000
            Output2:
            91
         */

        int firstNo = sc.nextInt(), secondNo = sc.nextInt();
        int decSecondNo = binaryToDecimal(secondNo);
        System.out.println(firstNo + decSecondNo);

        /*
            Fourth question
            Q4 - Multiply two numbers given in different base
            Input1: 1st number is decimal, 2nd number is binary
            43
            10100011
            Output1: In decimal number
            7009
            Input2:
            56
            100011
            Output2:
            1960
         */

        int mulFirstNo = sc.nextInt(), mulSecondNo = sc.nextInt();
        int decMulSecondNo = binaryToDecimal(mulSecondNo);
        System.out.println(mulFirstNo * decMulSecondNo);

        /*
            Fifth question
            Q5 - Convert a decimal double number into binary string for upto k precision digits
            Input1:
            18.625
            3
            Output1: (in string format)
            10010.101
            Input2:
            32.45
            4
            Output2:
            100000.0111
         */

        double decDoubleNo = sc.nextDouble();
        int precision = sc.nextInt();

        int wholeNo = (int)(decDoubleNo);
        double fractionalPartNo = decDoubleNo%1;

        String ans = "";

        ans += decimalToBinary(wholeNo);
        ans += ".";
        ans += fractionalPartToBinary(fractionalPartNo, precision);

        System.out.println(ans);

    }

    static int decimalToBinary(int num){
        int mul = 1, sum = 0;
        while(num>0){
            sum+=(num%2)*mul;
            mul*=10;
            num/=2;
        }
        return sum;
    }

    static StringBuilder fractionalPartToBinary(double num, int precision){
        int counter = 1;
        StringBuilder ans = new StringBuilder();
        while(counter<=precision){
           num *= 2;
           ans.append((int)num); // getting only the integer part
           num %= 1;
           counter++;
        }
        return ans;
    }

    static int binaryToDecimal(int num){
        int mul = 1, sum = 0;
        while(num>0){
            sum+=(num%10)*mul;
            mul*=2;
            num/=10;
        }
        return sum;
    }
}
