package day14;

public class _05_DoWhile {
    public static void main(String[] args) {

        // Print numbers from 1 to 5 using do-while loop
        int number1 = 1;

        do {
            System.out.println("Number 1: " + number1);
            number1++; // increase the counter by 1
        } while (number1 <= 5);

        System.out.println("--------------------------");

        // Another example of the same logic
        int number2 = 1;

        do {
            System.out.println("Number 2: " + number2);
            number2++; // increment by 1
        } while (number2 <= 5);
    }
}
