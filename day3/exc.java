package excep;

public class exc {

    void method3() {
        try {
            int[] arr = new int[6];
            System.out.println("Result: " + arr[90]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    void method2() {
        method3();
    }

    void method1() {
        method2();
    }

    public static void main(String[] args) {
        exc obj = new exc();
        obj.method1();

    System.out.println("Program continues after exception handling.");
    }
}
