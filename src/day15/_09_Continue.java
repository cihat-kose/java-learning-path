package day15;

import java.util.Scanner;

public class _09_Continue {
    public static void main(String[] args) {
        // Ask the user for 5 numbers.
        // Sum the numbers except those between 6 and 10 (inclusive).

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            // Read the number
            // and add it to the sum if it meets the criteria
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number > 6 && number < 10) {
                continue; // Skip the rest of the loop iteration if the number is between 6 and 10
            }

            sum = sum + number;
        }
        System.out.println("Sum = " + sum);
    }
}
