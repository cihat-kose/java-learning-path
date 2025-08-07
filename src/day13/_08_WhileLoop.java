package day13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {
        /**
         * Write a program that keeps summing the numbers entered by the user
         * until a negative number is entered.
         */

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (number >= 0) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number > 0)
                sum += number;
        }

        System.out.println("Total sum: " + sum);

        // Loop Rule:
        // If the number of iterations is known: use FOR
        // If the number of iterations is unknown: use WHILE
    }
}
