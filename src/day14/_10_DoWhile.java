package day14;

import java.util.Scanner;

public class _10_DoWhile {
    public static void main(String[] args) {
        /**
         * In this ATM example, the user cannot withdraw more money than their balance.
         * If the entered amount is greater than the balance, the program should ask again.
         * When a valid amount is entered, the transaction is completed.
         * Implement this using a do-while loop.
         */

        Scanner scanner = new Scanner(System.in);
        double balance = 5000;
        double amountToWithdraw;

        do {
            System.out.println("Your balance: " + balance);
            System.out.print("Enter the amount you want to withdraw: ");
            amountToWithdraw = scanner.nextDouble();

            if (amountToWithdraw > balance) {
                System.out.println("Insufficient balance. Please enter a smaller amount.\n");
            }

        } while (amountToWithdraw > balance);

        System.out.println("Transaction successful!");
        System.out.println("Remaining balance: " + (balance - amountToWithdraw));
    }
}
