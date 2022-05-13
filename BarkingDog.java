package UdemyJavaCodingExercises;

/*
Coding Exercise 3:
We have a dog that likes to bark. We need to wake up if the dog is barking at night!
Write a method shouldWakeUp that has 2 parameters.

1st parameter should be of type boolean and be named barking it represents if our dog is currently barking
2nd parameter represents the hour of the day and is of type int with the name hourOfDay an has a valid range 0-23.

We have to wake up if the dog barking before 8 or after 22 hours so in that case return true.

In all other cases return false.

If the hourOfDay parameter is less than 0 or greater than 23 return false.



 */

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}
