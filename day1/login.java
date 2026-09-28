package day1;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        polymorfism obj = new polymorfism();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email or phone number");
        String input = scanner.nextLine().trim();

        if (input.contains("@")) {
            String email = input.substring(0, input.indexOf("@"));
            obj.login(email);
        } else {
            try {
                int phone = Integer.parseInt(input);
                obj.login(phone);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid email or phone number.");
            }
        }

        scanner.close();
    }
}