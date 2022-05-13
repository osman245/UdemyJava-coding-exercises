package UdemyJavaCodingExercises;
/*
Coding Exercise :17

Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.

 */

public class EvenDigitSum {


    public static int getEvenDigitSum(int number) {

        if (number < 0) return -1;

        int sum = 0;
        int lastDigit = 0;

        while (number != 0) {

            lastDigit = number % 10;
            if (lastDigit % 2 == 0) sum += lastDigit;
            number /= 10;

        }


        return sum;

    }

}