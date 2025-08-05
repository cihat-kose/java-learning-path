package day14;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        /**
         * A user is trying to log into the system by entering a password.
         * As long as the password is incorrect, the program should ask again.
         * When the correct password is entered, the program ends and displays the number of attempts.
         * Implement this using a do-while loop.
         */

        Scanner scanner = new Scanner(System.in);
        String correctPassword = "123456";
        String enteredPassword;
        int attemptCount = 0;

        do {
            System.out.print("Enter your password: ");
            enteredPassword = scanner.next();
            attemptCount++;

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Please try again.");
            }
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Login successful! Number of attempts: " + attemptCount);
    }
}
