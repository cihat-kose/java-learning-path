package day17;

import java.util.Scanner;

/**
 * Task:
 * - Read 8 book titles from the user into an array.
 * - Then repeatedly ask the user for a book title to search:
 *    If the book exists in the array, print "Book found",
 *    otherwise print "Book not in the library".
 * - Keep asking until the user types "exit".
 */
public class _11_JavaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[8];

        // Read 8 book titles
        System.out.println("Please enter 8 book titles:");
        for (int index = 0; index < books.length; index++) {
            System.out.print((index + 1) + ". book title: ");
            books[index] = scanner.nextLine();
        }

        // Search loop
        while (true) {
            System.out.print("Enter a book title to search (type 'exit' to quit): ");
            String query = scanner.nextLine();

            // Exit condition
            if (query.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the system...");
                break; // ends the while loop
            }

            // Check if the book exists
            boolean found = false;
            for (String book : books) {
                if (book.equalsIgnoreCase(query)) {
                    found = true;
                    break; // only breaks the for loop
                }
            }

            // Result message
            if (found) {
                System.out.println("Book found");
            } else {
                System.out.println("Book not in the library");
            }
        }

        scanner.close();
    }
}