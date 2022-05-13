package UdemyJavaCodingExercises;

public class NumberToWords {
/*
Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative,print "Invalid Value".

To print the number as words,follow these steps:

1.) Extract the last digit of the given number using the remainder operator
2.) Convert the value of the digit found in Step 1 into a word. There are 10 possible values
for that digit, those being 0,1,2,3,4,5,6,7,8,9. Print the corresponding word for
each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.



 */

    public static void numberToWords(int number) {
        int revNumber = reverse(number);
        if(revNumber < 0) System.out.println("Invalid Value");
        int lastDigit = number % 10;
        String s ="";



        while(revNumber != 0) {
            switch(lastDigit) {
                case 0:
                    s+= "Zero";
                    break;
                case 1:
                    s+="One ";
                    break;
                case 2:
                    s+="Two ";
                    break;
                case 3:
                    s+="Three ";
                    break;
                case 4:
                    s+="Four ";
                    break;
                case 5:
                    s+="Five ";
                    break;
                case 6:
                    s+="Six ";
                    break;
                case 7:
                    s+="Seven ";
                    break;
                case 8:
                    s+="Eight ";
                    break;
                case 9:
                    s+="Ninth ";
                    break;
            }
            revNumber /= 10;
            lastDigit = revNumber % 10;
        }

    }


    public static int reverse(int number) {
        boolean negative;
        if(number < 0) {
            negative = true;
        }else {
            negative = false;
        }

        int revNumber = Math.abs(number);
        int a = 0;
        int lastDigit = 0;
        while(revNumber != 0) {//234 ==> 432
            lastDigit = revNumber % 10;
            a = a*10 + lastDigit; //4 ==> 43==> 432
            revNumber /= 10;
        }

        if(negative) {
            revNumber = revNumber * (-1);
        }

        return revNumber;
    }


    public static int getDigitCount(int number) {
        if(number < 0) return -1;
    }




}

















