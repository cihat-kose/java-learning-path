package day15;

public class _11_Continue {
    public static void main(String[] args) {
        /**
         * Sum the even numbers from 1 to 100.
         * Print the running total at each step,
         * but skip printing whenever the total exceeds 1000.
         * Use the continue statement to skip those print steps.
         */

        int total = 0;

        for (int i = 2; i <= 100; i += 2) {
            total += i;

            if (total > 1000)
                continue; // skip the rest of the loop body and continue with the next iteration

            System.out.println("Current total = " + total);
            System.out.println("Loop continues...");
        }

        System.out.println("Final total = " + total);
    }
}
