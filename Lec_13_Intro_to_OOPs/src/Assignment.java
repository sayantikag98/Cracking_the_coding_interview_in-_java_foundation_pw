import java.util.Scanner;
class Student{
    String name;
    int roll_no;

    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}

class Triangle{
    int base, hyp, alt;

    Triangle(){
        base = 3;
        alt = 4;
        hyp = 5;
    }

    int perimeter(){
        return base + hyp + alt;
    }

    double area(){
        return 0.5 * base * alt;
    }
}

class Area{
    int length, breadth;

    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int returnArea(){
        return length * breadth;
    }
}

class Complex{
    int real, img;

    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }

    void complexAdd(Complex c1){
        int realAdd = this.real + c1.real;
        int imgAdd = this.img + c1.img;
        printResult(realAdd, imgAdd, "addition");
    }

    void complexSub(Complex c1){
        int realSub = this.real - c1.real;
        int imgSub = this.img - c1.img;
        printResult(realSub,imgSub, "subtraction");
    }

    void complexMul(Complex c1){
        int realMul = this.real * c1.real + this.img * c1.img * -1;
        int imgMul = this.img * c1.real + this.real * c1.img;
        printResult(realMul, imgMul, "multiplication");
    }

    void printResult(int realRes, int imgRes, String operation){
        if(imgRes<0){
            if(realRes != 0)
                System.out.println("The "+operation+" result is: "+realRes+imgRes+"i");
            else
                System.out.println("The "+operation+" result is: "+imgRes+"i");
        }
        else if(imgRes == 0){
            if(realRes != 0)
                System.out.println("The "+operation+" result is: "+realRes);
            else
                System.out.println("The "+operation+" result is: "+0);
        }
        else{
            if(realRes != 0)
                System.out.println("The addition result is: "+realRes+"+"+imgRes+"i");
            else
                System.out.println("The addition result is: "+imgRes+"i");
        }
    }
}
class Employee{
    String name, address;
    int yoj;

    Employee(String name, int yoj, String address){
        this.name = name;
        this.yoj = yoj;
        this.address = address;
    }

    void printInfo(){
        System.out.println("The name is: "+name);
        System.out.println("The year of joining is: "+yoj);
        System.out.println("The address is: "+address);
    }
}

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student("John", 2);
        Triangle t = new Triangle();
        System.out.println(t.perimeter());
        System.out.println(t.area());
        int length = sc.nextInt(), breadth = sc.nextInt();
        Area a = new Area(length, breadth);
        System.out.println(a.returnArea());

        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreet");
        e1.printInfo();
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreet");
        e2.printInfo();
        Employee e3 = new Employee("John", 1999, "26B- WallsStreet");
        e3.printInfo();

        int real1 = sc.nextInt(), img1 = sc.nextInt(), real2 = sc.nextInt(), img2 = sc.nextInt();
        Complex c1 = new Complex(real1, img1);
        Complex c2 = new Complex(real2, img2);
        c1.complexAdd(c2);
        c1.complexSub(c2);
        c1.complexMul(c2);
    }
}
