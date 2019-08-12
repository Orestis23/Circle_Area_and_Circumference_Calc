package co.grandcircus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

	// @author Orestis Sinis

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double rad;
		int cirCount = 0;

		System.out.println("Hi! Would you like to do math with Rusty?! (y/n)");
		char userChar = scan.next().charAt(0);
		scan.nextLine();

		while (userChar == 'y') {

			System.out.println("Please enter a radius.");

			try {

				rad = scan.nextDouble();
				Circle cir = new Circle(rad);
				System.out.println("The area of your circle is...");
				System.out.println(cir.getFormattedArea());
				System.out.println("The circumference of your circle is...");
				System.out.println(cir.getFormattedCircumference());
				cirCount++;
			}

			catch (InputMismatchException e) {
				System.out.println("That input wasn't valid2, please enter a number!");
				scan.nextLine();
				e.printStackTrace();

			} catch (Exception e2) {
				System.out.println("That input wasn't valid, please enter a number!");
				scan.nextLine();
				e2.printStackTrace();
			}

			System.out.println("Would you like to enter another circle?");
			userChar = scan.next().charAt(0);
		}

		System.out.println("You created " + cirCount + " circles!");
		System.out.println("Goodbye!");
	}

}
