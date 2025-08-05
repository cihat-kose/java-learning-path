package day14;

import java.util.Scanner;

public class _09_DoWhile {
    public static void main(String[] args) {
        /**
         * A restaurant order system asks the user to make a selection between 1 and 5.
         * If the user enters an invalid option, show the menu again and ask for input.
         * Implement this using a do-while loop.
         */

        Scanner scanner = new Scanner(System.in);
        int selection;

        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Hamburger");
            System.out.println("2. Pizza");
            System.out.println("3. Doner Kebab");
            System.out.println("4. Pasta");
            System.out.println("5. Beans");
            System.out.print("Please make a selection (1-5): ");
            selection = scanner.nextInt();

            if (selection < 1 || selection > 5) {
                System.out.println("Invalid selection. Please try again.\n");
            }

        } while (selection < 1 || selection > 5);

        System.out.println("Your selection: " + selection);
    }
}
