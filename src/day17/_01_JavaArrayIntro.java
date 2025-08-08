package day17;

public class _01_JavaArrayIntro {
    public static void main(String[] args) {
        /**
         * Java Arrays Introduction
         * - Difference between single variable and array
         * - How to declare and initialize arrays
         * - How to store and retrieve values
         * - How to loop through arrays
         */

        // Single value variables
        int number = 5;
        double amount = 30.45;
        boolean result = false;
        String theme = "Marvel";

        // Problem: storing grades for many students without arrays
        int studentGrade1 = 65;
        int studentGrade2 = 89;
        int studentGrade5 = 100;

        // Solution: use arrays to store multiple values in one structure
        int[] grades = new int[5]; // array to hold 5 integers

        // Assigning values to array elements
        grades[0] = 77; // index 0 = first element
        grades[1] = 44;
        grades[2] = 66;
        grades[3] = 89;
        grades[4] = 100; // index 4 = last element (5th element)

        // Direct initialization with values
        int[] notes = {65, 89, 34, 57, 100};
        String[] names = {"Mehmet", "Baris", "Ramazan", "Sibel", "Meryem"};

        // Accessing elements
        System.out.println("First student's grade = " + grades[0]);
        System.out.println("Last student's grade = " + grades[4]);
        System.out.println("Number of grades = " + grades.length);

        System.out.println("---- Loop from start to end ----");
        for (int index = 0; index < grades.length; index++) {
            System.out.println((index + 1) + ". element = " + grades[index]);
        }

        System.out.println("---- Loop using index starting from 1 ----");
        for (int index = 1; index <= grades.length; index++) {
            System.out.println(index + ". element = " + grades[index - 1]);
        }

        System.out.println("---- Loop backwards ----");
        for (int index = grades.length; index > 0; index--) {
            System.out.println(index + ". element = " + grades[index - 1]);
        }
    }
}
