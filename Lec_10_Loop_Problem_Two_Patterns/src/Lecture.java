import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
             First pattern
             4 10
             **********
             **********
             **********
             **********
         */

//        int row, col;
//        row = sc.nextInt();
//        col = sc.nextInt();
//
//        for(int i = 1; i<=row; ++i){
//            for(int j = 1; j<=col; ++j){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
             Second pattern
             4 6
             ******
             *    *
             *    *
             ******
         */

//        int row1 = sc.nextInt(), col1 = sc.nextInt();
//        for(int i = 1; i<=row1; i++){
//            if(i == 1 || i == row1){
//                for(int j = 1; j<=col1; j++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                System.out.print("*");
//                for(int j = 1; j<=col1-2; j++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            Third pattern
            4
            *
            **
            ***
            ****
         */

//        int row2 = sc.nextInt();
//        for(int i = 1; i<=row2; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
             Fourth pattern
             4
             ****
             ***
             **
             *
         */

//        int row3 = sc.nextInt();
//        for(int i = 1; i<= row3; ++i){
//            for(int j = row3; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            Fifth pattern
                5
                *
               ***
              *****
             *******
            *********
         */

//        int row4 = sc.nextInt(), nsp = row4 - 1, nst = 1;
//        for(int i = 1; i<=row4; ++i){
//            for(int j = 1; j<=nsp; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=nst; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//            nsp--;
//            nst+=2;
//        }

        /*
            Sixth pattern
            8
            1 2 3 4 5 6 7 8
            2 3 4 5 6 7 8 1
            3 4 5 6 7 8 1 2
            4 5 6 7 8 1 2 3
            5 6 7 8 1 2 3 4
            6 7 8 1 2 3 4 5
            7 8 1 2 3 4 5 6
            8 1 2 3 4 5 6 7
         */

//        int row5 = sc.nextInt();
//        for(int i = 1; i<=row5; i++){
//            int k = i;
//            for(int j = 1; j<=row5; j++){
//                System.out.print(k +" ");
//                k++;
//                if(k>row5) k = 1;
//            }
//            System.out.println();
//        }

        /*
            Seventh pattern
            4 6
            1 2 3 4 5 6
            1 2 3 4 5 6
            1 2 3 4 5 6
            1 2 3 4 5 6
         */
//        int row6 = sc.nextInt(), col6 = sc.nextInt();
//        for(int i = 1; i<=row6; i++){
//            for(int j = 1; j<=col6; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        /*
            Eight pattern
            4 6
            1 2 1 2 1 2
            2 1 2 1 2 1
            1 2 1 2 1 2
            2 1 2 1 2 1
         */

//        int row7 = sc.nextInt(), col7 = sc.nextInt();
//        for(int i = 1; i<=row7; i++){
//            for(int j = 1; j<=col7; j++){
//                if(((i&1)==1 && (j&1)==1)||((i&1)==0 && (j&1)==0))
//                    System.out.print(1+" ");
//                else
//                    System.out.print(2+" ");
//            }
//            System.out.println();
//        }

        /*
            Ninth pattern
            4
            1
            1 2
            1 2 3
            1 2 3 4
         */

//        int row8 = sc.nextInt();
//        for(int i = 1; i<=row8; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        /*
            Tenth pattern
            6
                      1
                    1 2 1
                  1 2 3 2 1
                1 2 3 4 3 2 1
              1 2 3 4 5 4 3 2 1
            1 2 3 4 5 6 5 4 3 2 1
         */

//        int row9 = sc.nextInt(), nsp = row9 - 1;
//        for(int i = 1; i<=row9; i++){
//            int val = 1;
//            for(int j = 1; j<=i+row9-1; j++){
//                if(j<=nsp){
//                    System.out.print("  ");
//                }
//                else{
//                    System.out.print(val+" ");
//                    if(j<row9) val++;
//                    else val--;
//                }
//            }
//            nsp--;
//            System.out.println();
//        }

        /*
            Eleventh pattern
            5
                1
               2 2
              3   3
             4     4
            555555555
         */
        int row10 = sc.nextInt();
        for(int i = 1; i<=row10; i++){
            for(int j = 1; j<=row10+i-1; j++){
                if(j<=row10-i){
                    System.out.print(" ");
                }
                else{
                    if(i==row10 || i+j == row10+1 || j-i == row10-1){
                        System.out.print(i);
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
