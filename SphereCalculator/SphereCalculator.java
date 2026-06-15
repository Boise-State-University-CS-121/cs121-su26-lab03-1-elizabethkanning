import java.util.Scanner;

/**
 * This program takes user of the radius and calculates
 * and prints the volume and surface area of a sphere
 * @author Elizabeth Kanning
 */

public class SphereCalculator {
    public static void main (String [] args)
    {
        int radiusSphere; //input
        double volumeSphere; //output
        double surfaceAreaSphere; //output

        Scanner scan = new Scanner(System.in); // opens scanner

        System.out.print("Enter the sphere's radius: "); // Prints "Enter the sphere's radius" to the terminal
        radiusSphere = scan.nextInt(); // Collects user imput for sphere radius

        volumeSphere = (4.0 / 3.0) * Math.PI * Math.pow(radiusSphere, 3); // Calculates volume of a sphere
        System.out.print("Volume: "); // Prints "Volume: " to the terminal
        System.out.printf("%.4f\n", volumeSphere); // Prints volume of the sphere to 4 decimal places

        surfaceAreaSphere = 4.0 * Math.PI * Math.pow(radiusSphere, 2); // Calculates surface area of a sphere
        System.out.print("Surface area: "); // Prints "Surface area: " to the terminal
        System.out.printf("%.4f\n", surfaceAreaSphere); // Prints surface area to 4 decimal places

        scan.close(); //closes scanner
    }
}
