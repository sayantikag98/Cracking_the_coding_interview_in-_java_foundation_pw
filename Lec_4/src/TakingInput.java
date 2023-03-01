import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String name1 = sc.nextLine();
        int num = sc.nextInt();

        System.out.println("The number is "+num);
        System.out.println("The name is "+name);
        System.out.println("The name with space is "+name1);
    }
}
