package excep;

public class exceptionhendeling {
    

    public static void main(String[] args) {
    
        try {
            int arr[] = new int[6]; // This will throw an ArithmeticException
            System.out.println("Result: " + arr[90]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:not  allowd.");
        } 
      
    }
}
