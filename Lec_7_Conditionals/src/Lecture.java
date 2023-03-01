import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Even or odd
//        int num = sc.nextInt();
//        if((num&1) != 0){
//            System.out.println("Number is Odd");
//        }
//        else{
//            System.out.println("Number is Even");
//        }

//        System.out.println("The number is: "+((num&1) == 1? "Odd": "Even"));

        // Taking age
//        int age;
//        age = sc.nextInt();
//        if(age<=12){
//            System.out.println("Children");
//        }
//        else if(age>12 && age <18){
//            System.out.println("Teenager");
//        }
//        else{
//            System.out.println("Adult");
//        }

        //Checking even or odd and divisibility by 3
//        int newNum;
//        newNum = sc.nextInt();
//        if((newNum & 1) == 0 && newNum%3==0){
//            System.out.println("This is the number");
//        }
//        else{
//            System.out.println("This is not the number");
//        }

        int day;
        day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There is no such day");
        }
    }
}
