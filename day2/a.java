package day2;

interface Face {
    void method1();
    void method2();
}

abstract class TestImplementation implements Face {
    @Override
    public void method1() {
        System.out.println("Method 1 implementation in class A");
    }
}

class B extends TestImplementation {
    @Override
    public void method2() {
        System.out.println("Method 2 implementation in class B");
    }
}

public class a {
    public static void main(String[] args) {
        B obj = new B();
        obj.method1();
        obj.method2();
    }
}