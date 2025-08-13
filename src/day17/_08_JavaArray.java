package day17;

import java.util.Scanner;

public class _08_JavaArray {
    public static void main(String[] args) {
        /**
         * Task:
         * Get the grades of 5 students from the user and store them in an array.
         * Then:
         * - Print each student's grade and status (Passed/Failed).
         * - Calculate the class average.
         * - Print the number of students whose grades are above the average.
         */

        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];
        int total = 0;

        System.out.println("Enter the grades of 5 students:");
        for (int index = 0; index < grades.length; index++) {
            System.out.print("Grade of student " + (index + 1) + ": ");
            grades[index] = scanner.nextInt();
            total += grades[index];
        }

        double average = (double) total / grades.length;
        int aboveAverageCount = 0;

        System.out.println("\nStudent results:");
        for (int index = 0; index < grades.length; index++) {
            if (grades[index] >= 50) {
                System.out.println("Student " + (index + 1) + " passed with grade " + grades[index]);
            } else {
                System.out.println("Student " + (index + 1) + " failed with grade " + grades[index]);
            }

            if (grades[index] > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("\nClass average: " + average);
        System.out.println("Number of students above average: " + aboveAverageCount);
    }
}