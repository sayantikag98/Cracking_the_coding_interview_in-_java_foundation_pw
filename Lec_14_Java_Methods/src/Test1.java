class Test2{
    Test2(){
        System.out.println("test 2 constructor called");
        Test1 t = new Test1();
        t.Hello();
    }
}

class Test1 {

    Test1(){
        System.out.println("test 1 constructor called");
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
    }
    void Hello(){
        System.out.println("hello ");
    }
}


