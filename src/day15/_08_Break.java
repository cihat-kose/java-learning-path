package day15;

import java.util.Scanner;

public class _08_Break {
    public static void main(String[] args) {
        /**
         * Ask the user to enter 5 numbers.
         * Stop asking for more numbers as soon as the total exceeds 10.
         * Use a for loop and break statement.
         */

        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            total += number;

            if (total > 10)
                break;
        }

        System.out.println("Total = " + total);
    }
}
