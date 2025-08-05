package day14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        /**
         * Write a do-while loop that asks the user to enter the correct password
         * and keeps prompting until the correct password is entered.
         */

        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Enter password:");
            // scanner.next() alone would read the input but not assign it to any variable.
            password = scanner.next(); // read the input and assign it to the password variable
        } while (!password.equals("123456")); // keep looping until password is correct

        System.out.println("Login successful!");
    }
}
