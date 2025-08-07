package day15;

public class _07_Break {
    public static void main(String[] args) {
        /**
         * Print the running total of even numbers from 1 to 100.
         * Stop the process once the total exceeds 1000.
         */

        int total = 0;

        for (int i = 2; i <= 100; i += 2) {
            total += i;
            System.out.println("Current total = " + total);

            if (total > 1000) {
                System.out.println("Total exceeded 1000, stopping...");
                break; // exits the loop when total exceeds 1000
            }
        }
    }
}
