package UdemyJavaCodingExercises;
/*
Coding Exercise 5:

Write a method areEqualByThreeDecimalPlaces with two parameters of type double
THe method should return boolean and it needs to return true if two double numbers
are the same up to three decimal places.



 */


public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int ans1 = (int) num1 * 1000;
        int ans2 = (int) num2 * 1000;


        if (ans1 == ans2) return true;
        else return false;

    }
}
