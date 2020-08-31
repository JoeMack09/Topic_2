/*
Sum the digits of an integer. Write a program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 932, the sum of all its digits is 14.
 */

import java.util.Scanner;

public class ExerciseTwoSix {

    static int userNumber;
    static int tempNumber1;
    static int tempNumber2;
    static int tempNumber3;
    static int tempNumber4;
    static int remainingNumber1;
    static int remainingNumber2;
    static int remainingNumber3;
    static int remainingNumber4;
    static int addedNumbers;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 0 and 1000: ");
        userNumber = input.nextInt();

        tempNumber1 = userNumber / 10;
        remainingNumber1 = userNumber % 10;

        tempNumber2 = tempNumber1 / 10;
        remainingNumber2 = tempNumber1 % 10;

        tempNumber3 = tempNumber2 / 10;
        remainingNumber3 = tempNumber2 % 10;

        tempNumber4 = tempNumber3 / 10;
        remainingNumber4 = tempNumber3 % 10;

        addedNumbers = remainingNumber1 + remainingNumber2 + remainingNumber3 + remainingNumber4;

        System.out.println("The total of your numbers is " + addedNumbers);

    }
}
