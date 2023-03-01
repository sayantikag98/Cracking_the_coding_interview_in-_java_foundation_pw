import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
//        String firstName, lastName, interestedField;
//        int rollNo;

        Scanner sc = new Scanner(System.in);

        // first question
//        firstName = sc.next();
//        lastName = sc.next();
//        rollNo = sc.nextInt();
//        interestedField = sc.next();

        /*
        this works for single line input like Aman Gupta 203 Physics and also for multiline input like
            Aman Gupta
            203
            Physics

            // why it is working for multi line input is because
            first string is read by first next() and then the second string is read by the second string
            then a new line character is passed (enter is pressed) which cannot be read by nextInt() so then
            it reads the integer that follows after the new line. After that again a new line is passed which
            cannot be read by next() so it ignores it and then reads the string that follows.
         */

//        System.out.println("Name: "+(firstName +" "+ lastName));
//        System.out.println("Roll Number: "+rollNo);
//        System.out.println("Field of interest: "+interestedField);

        //second question
//        String firstStr, secondStr;
//        firstStr = sc.next();
//        secondStr = sc.next();
//        System.out.println(firstStr+secondStr);

        //third question
//        int firstNo, secondNo, thirdNo;
//        try{
//            firstNo = sc.nextInt();
//            secondNo = sc.nextInt();
//            thirdNo = sc.nextInt();
//            int sum = firstNo + secondNo + thirdNo;
//
//            System.out.println("Total marks: "+sum);
//            System.out.println("Percentage marks: "+(sum*100/300)+"%");
//        }
//        catch(InputMismatchException e){
//            System.out.println("Exception is: " +e.getMessage());
//        }

        //fourth question
//        int test;
//        test = sc.nextInt();
//        int a, b;
//        for(int i = 0; i<test; ++i){
//            a = sc.nextInt();
//            b = sc.nextInt();
//            System.out.println(a+b);
//        }

        //fifth question
        String firstString, secondString;
        while(sc.hasNextLine()) {
            firstString = sc.next();
            secondString = sc.next();
            System.out.println(firstString + secondString);
        }




    }
}
