package demo.util;

public class App {

    public static void Hi(){
        System.out.println("Hi");
    }
    public static void Hello(){
        System.out.println("hello");
        App1.World();
        Hi();

    }
}
