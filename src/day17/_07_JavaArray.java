package day17;

public class _07_JavaArray {
    public static void main(String[] args) {
        /**
         * A table stores the school numbers of 5 students.
         * The student searches for their own number.
         * If found, print "Number found", otherwise print "Number not found".
         */

        int[] numbers = {2313, 2456, 2134, 2478, 2123};
        int studentNumber = 2313;
        boolean found = false;

        for (int number : numbers) {
            if (studentNumber == number) {
                found = true;
                break;
            }
        }

        // No need for "found == true" since if already checks the boolean value
        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
