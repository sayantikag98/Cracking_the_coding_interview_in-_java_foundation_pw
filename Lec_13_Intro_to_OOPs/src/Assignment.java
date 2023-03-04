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

public class Assignment {
    public static void main(String[] args) {
        Student s = new Student("John", 2);
        Triangle t = new Triangle();
        System.out.println(t.perimeter());
        System.out.println(t.area());
    }
}
