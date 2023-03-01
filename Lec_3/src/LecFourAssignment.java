public class LecFourAssignment {
    static void product(){
        int x = 2, y = 4;
        System.out.println(x*y);
    }

    static void printAscii(){
        char ch = 'U';
        System.out.println((int)ch);
    }

    static void printArea(){
        int length = 7, breadth = 4;
        System.out.println(length * breadth);
    }

    static void calcCube(){
        int num = 4;
        System.out.println(num * num * num);
    }

    static void swap(){
        int x = 2, y = 3;
        System.out.println("Before swap");
        System.out.print("x = " + x + " and y = " + y);
        System.out.println();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap");
        System.out.print("x = " + x + " and y = " + y);
    }
    public static void main(String [] args){
        product();
        printAscii();
        printArea();
        calcCube();
        swap();
    }
}
