package day1;

class A {
    String name;
    int id;
}

class B extends A {
    int salary;
    String address;

    void show(String n, int i, int s, String a) {
        name = n;
        id = i;
        salary = s;
        address = a;
    }
}

class C extends B {
    int ebill;
    int rent;

    void display(int e, int r) {
        ebill = e;
        rent = r;
        int total = ebill + rent;
        System.out.println("Total: " + total);
        System.out.println("Name: " + name);
    }
}

public class inheritans {
    public static void main(String[] args) {
        C obj = new C();
        obj.show("John", 101, 5000, "123 Street");
        obj.display(100, 500);
    }
}