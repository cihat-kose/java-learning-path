package day15;

import java.util.Scanner;

public class _10_Continue {
    public static void main(String[] args) {
        // Print each character of the entered string
        // on a new line, but do not print spaces.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // "Today the weather is very nice" 0 -> length-1

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i); // 0,1,2,3,4,...

            if (letter == ' ') continue; // skip to the next iteration if the character is a space
            // do not consider the characters after continue in this iteration

            System.out.println("letter = " + letter);
        }
    }
}
