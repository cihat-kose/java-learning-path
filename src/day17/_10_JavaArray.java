package day17;

import java.util.Scanner;

public class _10_JavaArray {
    public static void main(String[] args) {
        /**
         * Task:
         * Get the status (occupied/empty) of 10 seats in a cinema hall from the user.
         * Then calculate and display how many seats are empty.
         */

        Scanner scanner = new Scanner(System.in);
        boolean[] seats = new boolean[10];

        System.out.println("Enter whether each seat is occupied or empty (true = occupied, false = empty)");
        for (int index = 0; index < seats.length; index++) {
            System.out.print("Status of seat " + (index + 1) + ": ");
            seats[index] = scanner.nextBoolean();
        }

        int emptySeatCount = 0;
        for (boolean seat : seats) {
            if (!seat) {
                emptySeatCount++;
            }
        }

        System.out.println("Number of empty seats: " + emptySeatCount);
    }
}
