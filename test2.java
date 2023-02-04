
class App {
    App() {
        System.out.println("Constructor of App");
    }

    App(int num) {
        System.out.println(num);
    }
}

public class test2 extends App {
    test2() {
        super(20); // used to call constructor of base class
        System.out.println("Constructor of Test2");
    }

    public static void main(String[] args) {
        new test2();
    }
}

