package day16;

public class _05_DebugExample {
    public static void main(String[] args) {
        // This program demonstrates the use of the 'continue' statement within a loop.
        // It will print the values of 'i' from 0 to 39, but skip printing when 'i / 15 == 1'.

        for (int i = 0; i < 40; i++) {
            if (i / 15 == 1) {
                continue;  // For which values of 'i' will this statement execute?
            }
            System.out.println(i);
        }
    }
}
