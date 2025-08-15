package day17;

import java.util.Scanner;

public class _12_JavaArray {
    public static void main(String[] args) {
        /**
         * Task:
         * Get the names and prices of 5 products from the user and store them in two separate arrays.
         * Ask the user for a budget value.
         * List the products that the user can buy within their budget.
         * If no product can be purchased, print "No products within your budget."
         */

        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[5];
        double[] productPrices = new double[5];

        System.out.println("Enter the names and prices of 5 products");
        // No difference between productNames.length and productPrices.length
        for (int i = 0; i < productNames.length; i++) {
            System.out.print((i + 1) + ". product name: ");
            productNames[i] = scanner.nextLine();
            System.out.print(productNames[i] + " price: ");
            productPrices[i] = scanner.nextDouble();
            scanner.nextLine();
            // (Buffer clearing)
            // When using Scanner: after entering String data, if we use the same scanner to get int, double, etc.,
            // it does not allow us to enter String again without clearing the buffer.
            // That’s why we add this line.
            // Another way: define two different Scanner objects — one for Strings and one for numbers.
        }

        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();

        boolean hasAffordableProduct = false;
        System.out.println("Products within your budget:");
        for (int index = 0; index < productPrices.length; index++) {
            if (productPrices[index] <= budget) {
                System.out.println(productNames[index] + " - " + productPrices[index] + " TL");
                hasAffordableProduct = true;
            }
        }

        if (!hasAffordableProduct) {
            // Condition: if no product was affordable in the loop above
            // Initially, hasAffordableProduct is false
            // Adding ! means “if NOT affordable product found” becomes true, so we enter this block
            System.out.println("No products within your budget.");
        }

        /*
        // Alternative approach (not preferred because it prints "No products..." multiple times):
        for (int i = 0; i < productPrices.length; i++) {
            if (productPrices[i] <= budget) {
                System.out.println(productNames[i] + "-" + productPrices[i] + " TL");
            }
            else {
                System.out.println("No products within your budget.");
            }
        }
         */
    }
}
