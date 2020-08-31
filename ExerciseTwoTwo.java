import java.util.Scanner;

/*
Program that reads in the radius and length of a cylinder and computes the area and volume.
area = radius^2 * PI
volume = area * length
 */

public class ExerciseTwoTwo {

    final static double PI = 3.1415926;
    static double radius;
    static double length;
    static double area;
    static double volume;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the cylinder: ");
        radius = input.nextDouble();

        System.out.print("Please enter the length of the cylinder: ");
        length = input.nextDouble();

        area = (radius * radius) * PI;
        volume = area * length;

        System.out.println(area);

        System.out.println("The area of the cylinder is equal to " + area + " and the volume is " + volume + ".");


    }
}
