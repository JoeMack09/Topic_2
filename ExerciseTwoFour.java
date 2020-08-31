/*
Convert pounds into kilograms. Write a program that converts pounds into kilograms. The program prompts the user to
enter a number in pounds, converts it to kilograms, and displays the result. One pound is equal to 0.454 kilogram.
 */


import java.util.Scanner;

public class ExerciseTwoFour {

    static double pounds;
    static double kilograms;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a weight in pounds: ");
        pounds = input.nextDouble();

        kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
    }
}
