package day1;


public class polymorphism {

 public static void  tes1(){

   System.out.println("this   is   test1");
 }
public static void  tes1(int x){

   System.out.println("this   is   test2");
 }

    public static void main(String[] args) {
      polymorphism  obj=new polymorphism();
      obj.tes1();
      obj.tes1(1);




    }
}