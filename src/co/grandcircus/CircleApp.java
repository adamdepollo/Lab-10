package co.grandcircus;

import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		// Create scanner and variables
		Scanner scnr = new Scanner(System.in);
		String cont = "yes";
		double r = 0.0;

		// Loop while user wants to continue
		while (cont.equalsIgnoreCase("yes")) {
			// Set r to a radius entered by the user, and use the Validator.getDouble method
			// to validate the user's entry
			r = Validator.getDouble(scnr, "Enter a circle radius greater than 0:", 0.0, Double.MAX_VALUE);
			
			//Construct a circle using the radius entered as a parameter to call the Circle class
			Circle circle1 = new Circle(r);
			
			//Print the circle created with the user's entered radius
			System.out.println(circle1);
			System.out.println();
			
			//Ask user if they want to continue
			System.out.println("Do you want to continue? (yes/no)");
			cont = scnr.nextLine();
			
			//Ask for new input if their entry  is invalid
			while (!cont.equalsIgnoreCase("yes") && !cont.equalsIgnoreCase("no")) {
				System.out.println("Whoops, you didn't enter yes or no. Try again:");
				cont = scnr.nextLine();
			}
		}

		//Say bye and close scanner
		System.out.println("Bye!");
		scnr.close();
	}
}
