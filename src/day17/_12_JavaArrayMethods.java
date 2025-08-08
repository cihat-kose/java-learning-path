package day17;

import java.util.Arrays;

public class _12_JavaArrayMethods {
    public static void main(String[] args) {
        String[] names = {"Zeynep", "Roman", "Cihan", "Ahmet"};

        // Print the array directly
        System.out.println("Names = " + Arrays.toString(names));

        // Sort the array
        Arrays.sort(names);
        System.out.println("Sorted names = " + Arrays.toString(names));

        int[] numbers = {1, 8, 65, 45};
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Largest = " + numbers[numbers.length - 1]);

        // Fill the array with the same value
        Arrays.fill(numbers, 5); // Fill all elements with 5
        System.out.println("Numbers = " + Arrays.toString(numbers));
    }
}
