package UdemyJavaCodingExercises;
/*
Coding Exercise:20
Write a method named getGreatestCommonDivisor with two parameters of type int named
first and second. If one of the parameters is < 10, the method should return -1 to indicate
value.
The method should return the greatest common divisor of the two numbers(int).
The greatest common divisor is the largest positive integer that can fully divide
each of the integers(i.e. without leaving a remainder).
 */
public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int a,int b) {

        if(a < 10 || b < 10) return -1;

        int smaller = 0;
        int rem = 0;
        if(a < b) smaller = a;
        else smaller = b;

        for(int i = smaller; i > 0; i--) {

            if(a % i == 0 && b % i == 0) { rem = i; break;}

        }

        return rem;


    }



}
