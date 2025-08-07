package day16;

public class _04_DebugExample {
    public static void main(String[] args) {
        // F8 -> next step
        // F9 -> used to jump from one breakpoint to another
        // To run the program step by step and check the values at each step,
        // a breakpoint (red dot) is placed where we want the program to start.
        // Instead of RUN, select DEBUG to run the program. The program stops first
        // at the breakpoint and can be advanced step by step with F8. This way,
        // both the values can be monitored and how the program works can be tested.
        // F9 can be used to jump from one breakpoint to the next.

        int a = 10;

        a = 1000;

        a = a + 100;

        a = a + 5;

        System.out.println("a = " + a);
    }
}
