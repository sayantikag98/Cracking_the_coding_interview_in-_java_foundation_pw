import java.util.Scanner;
public class SumOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // this constructor needs to have an input stream
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The sum is: "+(a+b));
    }
}
