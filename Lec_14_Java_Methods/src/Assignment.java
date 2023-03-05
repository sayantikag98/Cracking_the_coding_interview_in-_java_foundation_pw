import java.util.Scanner;

class Average{
    int a, b, c;

    Average(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calcAvg(){
        return (a+b+c)/3.0;
    }
}

class Vowel{
    String s;

    Vowel(String s){
        this.s = s;
    }

    int calcVowelNo(){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}

class MiddleChar{
    String s;
    MiddleChar(String s){
        this.s = s;
    }

    StringBuilder displayMiddleChar(){
        StringBuilder ch = new StringBuilder();
        int ind = s.length()/2;
        if((s.length() & 1) == 0 && s.length()>0)
            ch.append(s.charAt(ind - 1));
        ch.append(s.charAt(ind));
        return ch;
    }
}

class LeapYear{
    int year;

    LeapYear(int year){
        this.year = year;
    }

    boolean isLeapYear(){
        // If a year is multiple of 400, then it is a leap year
        if(year % 400 == 0)
            return true;

        // Else If a year is multiple of 100, then it is not a leap year
        else if(year % 100 == 0)
            return false;

        // Else If a year is multiple of 4, then it is a leap year
        else if(year % 4 == 0)
            return true;

        return false;
    }
}

class SmallestNo{
    int a, b, c;

    SmallestNo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int calcSmallestNo(){
        return Math.min(a, Math.min(b,c));
    }
}

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Q1 - Write a Java method to compute the average of three numbers
            Input1:
            25
            45
            65
            Output1:
            45
            Input2:
            25
            25
            25
            Output2:
            25
         */
        int a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt();
        Average avg = new Average(a1, b1, c1);
        System.out.println(avg.calcAvg());

        /*
        Q2 - Write a Java method to count all vowels in a string
            Input1: (consists of all lowercase letters)
            coding
            Output1:
            2
            Input2: (consists of all lowercase letters)
            heaps
            Output2:
            2
         */

        String s2 = sc.nextLine();
        Vowel v = new Vowel(s2);
        System.out.println(v.calcVowelNo());

        /*
        Q3 - Write a Java method to display the middle character of a string.(Easy)
            Note: a) If the length of the string is even there will be two middle characters.
            b) If the length of the string is odd there will be one middle character.

            Input1:
            350
            Output1:
            5
            Input2:
            4004
            Output2:
            00
         */

        String s3 = sc.nextLine();
        MiddleChar mc = new MiddleChar(s3);
        System.out.println(mc.displayMiddleChar());

        /*
        Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year
             or not.

             Input1:
             2017
             Output1:
             False

             Input2:
             2022
             Output2:
             False
         */

        int year = sc.nextInt();
        LeapYear ly = new LeapYear(year);
        System.out.println(ly.isLeapYear());

        /*
        Q4 - Write a Java method to find the smallest number among three numbers.

            Input1:
            25
            37
            29
            Output1:
            25
            Input2:
            25
            25
            25
            Output2:
            25
         */

        int a5 = sc.nextInt(), b5 = sc.nextInt(), c5 = sc.nextInt();
        SmallestNo sn = new SmallestNo(a5, b5, c5);
        System.out.println(sn.calcSmallestNo());

    }
}
