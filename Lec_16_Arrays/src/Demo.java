class Demo1{
    static void print(){
        System.out.println("print from demo 1");
    }

    static void drive(){
        System.out.println("drive from demo 1");
    }
}

class Demo2{
    static void print(){
        System.out.println("print from demo 2");
    }

    static void speed(){
        System.out.println("speed from demo 2");
    }
}


public class Demo {

    public static void main(String[] args) {
        Demo2.speed();
        Demo1.drive();
        Demo1.print();
        Demo2.print();
    }
}
