package day15;

import java.util.Scanner;

public class _12_Continue {
    public static void main(String[] args) {
        /**
         * Ask the user to enter a sentence.
         * Print each character one by one on a new line,
         * but skip the space characters.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int length = sentence.length();

        // First way: using if statement
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) != ' ')
                System.out.println("Character = " + sentence.charAt(i));
        }

        System.out.println("--- Using continue ---");

        // Second way: using continue
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == ' ')
                continue; // skip spaces

            System.out.println("Character = " + sentence.charAt(i));
        }
    }
}
