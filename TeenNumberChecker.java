package UdemyJavaCodingExercises;
/*
Coding Exercise 7:
We'll say that a number is "teen" if it is in the range 13-19(inclusive)
write a method named hasTeen with 3 parameters of type int.
 */


public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three) {
        if ((one < 20 && one > 12) || (two < 20 && two > 12) || (three < 20 && three > 12)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen(int age) {
        if (age < 20 && age > 12) {
            return true;
        } else {
            return false;
        }

    }
}
