import java.util.Scanner;
import java.util.Random;

/**
 * This code takes a frist and last name from user input
 * and generates a unique username including a random number.
 * @author Elizabeth Kanning
*/

public class AccountGenerator {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Random randGen = new Random();

        String userFirst; 
        String userLast; 
        String generatedUsername; 
    
        System.out.print("Enter your first name: "); // Requests user input
        userFirst = scan.next(); // Collects user's first name
        System.out.print("Enter your last name: "); // Requests user input
        userLast = scan.next(); // Collects user's last name

        String tempFirst = userFirst.toLowerCase(); // Converts user's first name to all lowercase 
        char firstChar = tempFirst.charAt(0); // Isolates first character of user's first name

        String tempLast = userLast.toLowerCase(); // Converts user's last name to all lowercase
        String firstFive = tempLast.substring(0,5); // Isolates first five characters of user's last name

        int randNum = randGen.nextInt(90) + 10; // Generates random number between 10-99

        generatedUsername = firstChar + firstFive + randNum; // Concatenates username

        System.out.println("Username: " + generatedUsername); // Prints username to the terminal

        scan.close(); // closes scanner
    }
    
}
