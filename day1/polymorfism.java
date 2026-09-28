package day1;
public class polymorfism {
   String email;
   int  phone;
 public void  login( String email){
     this.email=email;
    System.out.println("welcome to my " + email + " account");
 }
 public void  login( int phone){
       this.phone=phone;
    System.out.println("welcome to my " + phone + " account");
 }
}