package day15;

import java.util.Scanner;

public class _14_Continue {
    public static void main(String[] args) {
        /**
         * Ask the user to enter 10 numbers.
         * If the entered number is a multiple of 5, calculate and print:
         * - Sum with its value minus 2
         * - Difference from its value minus 2
         * - Multiplication with its value minus 2
         * - Division by its value minus 2
         */

        Scanner scanner = new Scanner(System.in);

        // Method 1: Using if statement
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". Number = ");
            int number = scanner.nextInt();

            if (number % 5 == 0) { // multiple of 5
                System.out.println("Sum = " + (number + (number - 2)));
                System.out.println("Subtraction = " + (number - (number - 2)));
                System.out.println("Multiplication = " + (number * (number - 2)));
                System.out.println("Division = " + ((double) number / (number - 2)));
            }
        }

        System.out.println("--- Using continue ---");

        // Method 2: Using continue to skip non-multiples of 5
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". Number = ");
            int number = scanner.nextInt();

            if (number % 5 != 0)
                continue; // skip the rest of the loop for non-multiples of 5

            System.out.println("Sum = " + (number + (number - 2)));
            System.out.println("Subtraction = " + (number - (number - 2)));
            System.out.println("Multiplication = " + (number * (number - 2)));
            System.out.println("Division = " + ((double) number / (number - 2)));
        }
    }
}
