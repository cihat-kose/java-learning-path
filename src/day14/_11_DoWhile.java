package day14;

import java.util.Random;
import java.util.Scanner;

public class _11_DoWhile {
    public static void main(String[] args) {
        /**
         * In this number guessing game, the computer generates a random number between 1 and 100.
         * The user tries to guess the number.
         * The program continues to prompt the user until they guess correctly,
         * and then displays how many attempts it took.
         * Implement this using a do-while loop.
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int userGuess;
        int attemptCount = 0;

        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            attemptCount++;

            if (userGuess < randomNumber)
                System.out.println("Try a higher number.");
            else if (userGuess > randomNumber)
                System.out.println("Try a lower number.");

        } while (userGuess != randomNumber);

        System.out.println("Congratulations! You guessed the correct number.");
        System.out.println("Number of attempts: " + attemptCount);
    }
}
