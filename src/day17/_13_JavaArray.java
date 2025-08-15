package day17;

import java.util.Scanner;

public class _13_JavaArray {
    public static void main(String[] args) {
        /**
         * Task:
         * Read the number of steps taken for 7 days into an array.
         * Then:
         * - Calculate the average step count.
         * - Find how many days are above the average.
         * - Print the highest and lowest step counts.
         */

        Scanner scanner = new Scanner(System.in);
        int[] steps = new int[7];
        int totalSteps = 0;

        System.out.println("Enter your step counts for 7 days:");
        for (int i = 0; i < steps.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            steps[i] = scanner.nextInt();
            totalSteps += steps[i];
        }

        // Average = total / number of days
        double average = (double) totalSteps / steps.length;
        int aboveAverageDays = 0;

        // Initialize min and max with the first day's value
        int maxSteps = steps[0];
        int minSteps = steps[0];

        // Traverse once to compute: above-average count, min, and max
        for (int daySteps : steps) {
            if (daySteps > average) {
                aboveAverageDays++;
            }
            if (daySteps > maxSteps) {
                maxSteps = daySteps;
            }
            if (daySteps < minSteps) {
                minSteps = daySteps;
            }
        }

        System.out.println("\nAverage steps: " + average);
        System.out.println("Days above average: " + aboveAverageDays);
        System.out.println("Highest steps: " + maxSteps);
        System.out.println("Lowest steps: " + minSteps);

        scanner.close();
    }
}
