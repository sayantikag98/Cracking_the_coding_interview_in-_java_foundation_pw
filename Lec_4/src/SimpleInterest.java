import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p, r, t;
        p = sc.nextFloat();
        r = sc.nextFloat();
        t = sc.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("The simple interest is: "+si);
    }
}
