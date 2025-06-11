package day02;

public class _03_EscapeCharacters {
    public static void main(String[] args) {

        /**
         * Escape Characters
         * \n -> moves to a new line
         * \t -> acts like pressing the tab key and adds whitespace
         * \b -> simulates backspace and deletes one character
         * \" -> prints a double quote
         * \\ -> prints a backslash (\\)
         * \r -> returns the cursor to the start of the line
         */
        System.out.println("HelloWorld!");   //HelloWorld!
        System.out.println("Hello\nWorld!"); //Hello
                                            //World!
        System.out.println("Hello\tWorld!"); //Hello   World!
        System.out.println("Hello\bWorld!"); //HellWorld!
        System.out.println("Hello\"World!"); //Hello"World!
        System.out.println("Hello\\World!"); //Hello\World!
        System.out.println("Hello\rWorld!"); //World!
    }
}
