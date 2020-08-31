import java.util.Scanner;

public class ExerciseTwoOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("Please enter a temperature in celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (9d / 5) * celsius + 32;

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees fahrenheit");


    }



}
