public class DemoInheritance {

    public static void main(String[] args) {

        Child c = new Child();
        c.printVal();

    }
}

class Parent{
    int val;
    Parent(){
        System.out.println("constructor of parent called");
        val = 100;
    }

    void printVal(){
        System.out.println(val);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("constructor of child called");
    }
}
