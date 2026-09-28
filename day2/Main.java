package day2;

class Student {

    private String name;
    private int age;
    private double marks;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setMarks(double marks) {
        if (marks > 90 && marks <= 100) {
            this.marks = marks;
            System.out.println("grade A");
        } else if (marks >= 70 && marks <= 90) {
            this.marks = marks;
            System.out.println("grade B.");
        } else {
            this.marks = marks;
            System.out.println("grade C");
        }
    }

    public double getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ahmad", 20);

        student.setMarks(80);

        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
    }
}
