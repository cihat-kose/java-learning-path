package day17;

import java.util.Scanner;

public class _14_JavaSplitMethod {
    public static void main(String[] args) {
        // Find out how many words are in a sentence entered by the user.
        // For example: "Today the weather is very nice" -> 5

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Method 1: Counting spaces
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') spaceCount++;  // Count the number of spaces
        }
        System.out.println("Number of words = " + (spaceCount + 1));

        // Method 2: Using split method
        String[] words = sentence.split(" "); // Split the sentence by spaces and store in an array
        System.out.println("Number of words = " + words.length);

        // Print each word
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + " = " + words[i]);
        }

        // Method 3: Directly using split method
        System.out.println("Number of words = " + sentence.split(" ").length);
    }
}
