import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //first question
//        int num1;
//        num1 = sc.nextInt();
//        System.out.println((num1+8)/3%5*5);

        //second question
//            int x, y;
//            x = sc.nextInt();
//            y = sc.nextInt();
//            System.out.println("Before swapping:");
//            System.out.println("The value of x: "+x+" and the value of y: "+y);
//            x = x+y;
//            y = x-y;
//            x = x-y;
//            System.out.println("After swapping");
//            System.out.println("The value of x: "+x+" and the value of y: "+y);

        //third question
//        int num2;
//        num2 = sc.nextInt();
//        int sumOfDigits = 0;
//        while(num2>0){
//            sumOfDigits+=num2%10;
//            num2/=10;
//        }
//        System.out.println("the sum of digits is: "+sumOfDigits);

        //fourth question
        // second option is correct

        //fifth question
        int firstNo, secondNo;
        firstNo = sc.nextInt();
        secondNo = sc.nextInt();


        // two ways of counting the number of set bits

        // first way has been done by me O(log n)
        int xorOfNum = firstNo ^ secondNo, count = 0;
        while(xorOfNum>0){
            int xorAns = xorOfNum & 1;
            if( xorAns == 1) ++count;
            xorOfNum>>=1;
        }
        System.out.println("count by first method: " +count);


        //second way as given by pw O(no of set bits)
        xorOfNum = firstNo ^ secondNo;
        count = 0;
        while(xorOfNum != 0){
            xorOfNum &= xorOfNum - 1;
            ++count;
        }
        System.out.println("count by second method: " +count);


    }
}
