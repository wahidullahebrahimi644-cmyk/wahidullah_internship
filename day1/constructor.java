package day1;

public class constructor {

    public constructor() {
       System.out.println("Hello, World!");

    }
   {

     System.out.println("Hello, instances!");


   }
  static {
        System.out.println("Hello, static!");
    }
   



    public static void main(String[] args) {
          constructor main = new constructor();
          
    }
}
