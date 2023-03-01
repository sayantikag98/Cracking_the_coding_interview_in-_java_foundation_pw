import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //first question
//       int length, breadth;
//       length = sc.nextInt();
//       breadth = sc.nextInt();
//
//       if(length == breadth)
//           System.out.println("It is a square");
//       else
//           System.out.println("It is a rectangle");

        //second question
//        int num = sc.nextInt();
//        if(num < 0){
//            num*=-1;
//        }
//        System.out.println(num);

        //third question
//        int cp = sc.nextInt(), sp = sc.nextInt(), pl = 0;
//        if(sp>=cp) pl = sp - cp;
//        else pl = cp - sp;
//        System.out.println(pl);

        //fourth question
//        int userNum = sc.nextInt();
//        if(userNum>0) System.out.println(userNum);

        //fifth question

//        int a = sc.nextInt(), b = sc.nextInt();
//        char op = sc.next().charAt(0);
//
//
//        switch(op){
//            case '+':
//                System.out.println(a+"+"+b+" = "+(a+b));
//                break;
//            case '-':
//                System.out.println(a+"-"+b+" = "+(a-b));
//                break;
//            case '*':
//                System.out.println(a+"*"+b+" = "+(a*b));
//                break;
//            case '/':
//                System.out.println(a+"/"+b+" = "+(a/b));
//                break;
//            default:
//                System.out.println("Please enter valid operator");
//        }

        // sixth question

        float marks = sc.nextFloat();
        if(marks <= 100 && marks >90){
            System.out.println("A+");
        }
        else if(marks<=90 && marks > 80){
            System.out.println("A");
        }
        else if(marks<=80 && marks > 70){
            System.out.println("B+");
        }
        else if(marks<=70 && marks > 60){
            System.out.println("B");
        }
        else if(marks<=60 && marks > 50){
            System.out.println("C");
        }
        else if(marks<=50 && marks > 40){
            System.out.println("D");
        }
        else if(marks<=40 && marks > 30){
            System.out.println("E");
        }
        else if(marks<=30 && marks >= 0){
            System.out.println("F");
        }
    }
}
