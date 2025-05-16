package day04;

public class _01_Printf {
    public static void main(String[] args) {
        int number = 5;
        double ratio = 10 / (double) 3;

        System.out.println("number = " + number);
        System.out.println("ratio = " + ratio);

        System.out.printf("values = %d - %f", number, ratio);
        System.out.println();
        System.out.printf("values = %5d - %.2f", number, ratio);
        System.out.println();
        System.out.printf("values = %-5d - %.2f", number, ratio);
    }
}
