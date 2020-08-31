import java.util.Scanner;

/*
Convert feet into meters. Write a program that reads a number in feet, converts it to meters, and displays the result.
One foot is 0.305 meters.
 */

public class ExerciseTwoThree {

    static double feetDistance;
    static double meterDistance;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a measurement in feet: ");
        feetDistance = input.nextDouble();

        meterDistance = feetDistance * 0.305;

        System.out.println(feetDistance + " feet is equal to " + meterDistance + " meters");
    }
}
