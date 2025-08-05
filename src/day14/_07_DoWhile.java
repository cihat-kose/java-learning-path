package day14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        /**
         * In a market application, the user is repeatedly asked to enter product prices.
         * When the user enters 0, the program stops and prints the total amount.
         * Write this using a do-while loop.
         */

        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double price;

        do {
            System.out.println("Enter price (press 0 to exit):");
            price = scanner.nextDouble();
            total += price;
        } while (price != 0);

        System.out.println("Total amount: " + total);
    }
}
