package day15;

import java.util.Scanner;

public class _09_Break {
    public static void main(String[] args) {
        /**
         * The computer randomly selects a number between 0 and 9.
         * The user has 5 attempts to guess the number.
         * - If the user guesses correctly, print "Congratulations" and show how many attempts it took.
         * - If the user cannot guess within 5 attempts, print "You couldn't guess it"
         *   and display the number.
         */

        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 10);

        for (int attempt = 1; attempt <= 5; attempt++) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations!");
                System.out.println("You found it in " + attempt + " attempts.");
                break;
            } else {
                System.out.println("Wrong guess!");
            }
        }

        System.out.println("The secret number was: " + secretNumber);
    }
}
