/*
Financial Application: Calculate Tips. Write a program that reads the subtotal and the gratuity rate, then computes the
gratuity and total. For example, if the user enters 10 for the subtotal and 15% for gratuity rate, the program displays
$1.5 as gratuity and $11.5 as total.
 */

import java.util.Scanner;

public class ExerciseTwoFive {

    static double gratuityRate;
    static double subTotal;
    static double decimalGratuity;
    static double tempTotal;
    static double total;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the subtotal and the gratuity rate: ");
        subTotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        decimalGratuity = gratuityRate / 100;

        tempTotal = decimalGratuity * subTotal;

        total = tempTotal + subTotal;



        System.out.println("The total gratuity is $" + tempTotal + " and the total bill is $" + total);

    }

}
