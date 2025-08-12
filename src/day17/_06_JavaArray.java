package day17;

public class _06_JavaArray {
    public static void main(String[] args) {
        /**
         * Add 5 fruits to a fruit basket and print them in order.
         */

        String[] fruitBasket = {"Orange", "Kiwi", "Dragon fruit", "Quince", "Watermelon"};

        // Using for loop
        for (int index = 0; index < fruitBasket.length; index++) {
            System.out.println(fruitBasket[index]);
        }

        System.out.println("--------------------");

        // Using foreach loop
        for (String fruit : fruitBasket) {
            System.out.println(fruit);
        }
        // The variable 'fruit' takes each element of fruitBasket one by one.
    }
}
