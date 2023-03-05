public class StdLibMethods {

    class Demo{
        static double deal(double val){
            return val;
        }
    }
    public static void main(String[] args) {
        System.out.println(Math.sqrt(64));
        System.out.println(Math.sqrt(13));
        System.out.println(Math.ceil(3.7));
        System.out.println(Math.ceil(3.3));
        System.out.println(Math.floor(3.7));
        System.out.println(Math.floor(3.3));

        int a = 10;
        System.out.println(Math.sqrt(a));

        System.out.println(Demo.deal(a));
    }
}

