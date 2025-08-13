package day17;

import java.util.Scanner;

public class _09_JavaArray {
    public static void main(String[] args) {
        /**
         * Task:
         * Get the daily temperatures for a week (7 days) from the user and store them in an array.
         * Then, count and print the number of days with temperatures higher than a user-defined value.
         */

        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[7];

        System.out.println("Enter the temperatures for this week:");
        for (int index = 0; index < temperatures.length; index++) {
            System.out.print("Day " + (index + 1) + ": ");
            temperatures[index] = scanner.nextDouble();
        }

        System.out.print("Enter a temperature value to compare: ");
        double threshold = scanner.nextDouble();

        int count = 0;
        for (double temp : temperatures) {
            if (temp > threshold) {
                count++;
            }
        }

        System.out.println("Temperature threshold: " + threshold +
                ", number of days above threshold: " + count);
    }
}