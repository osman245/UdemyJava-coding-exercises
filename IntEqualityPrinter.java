package UdemyJavaCodingExercises;

/*
Coding Exercise 10:

Write a method printEqual with 3 parameters of type int.The method should not return anything(void).

If one of the parameters is less than 0, print text "Invalid Value"


 */
public class IntEqualityPrinter {
    public static String INVALID = "Invalid Value";

    public static void printEqual(int a, int b, int c) {
        if (a < 0 | b < 0 | c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && a != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
