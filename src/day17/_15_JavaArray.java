package day17;

import java.util.Arrays;

public class _15_JavaArray {
    public static void main(String[] args) {
        // Fill an array of 10 elements with random numbers (including 10),
        // then find out how many of them are odd and how many are even.

        int[] array = new int[10];  // Define an array with 10 elements

        // Fill the array with random numbers from 0 to 10
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        int oddCount = 0, evenCount = 0;

        // Count the number of odd and even numbers in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;    // evenCount = evenCount + 1;
            } else {
                oddCount++;  // oddCount = oddCount + 1;
            }
        }

        // Print the array and the counts
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Number of odd elements = " + oddCount);
        System.out.println("Number of even elements = " + evenCount);
    }
}
