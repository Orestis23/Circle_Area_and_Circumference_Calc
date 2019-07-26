package co.grandcircus;

import java.util.Scanner;

public class Lab10 {

	// @author Orestis Sinis

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Hi!  Would you like to do math with Rusty?! (y/n)");
		char userChar = scan.next().charAt(0);

		while (userChar == 'y') {
			System.out.println("Please enter a radius.");
			try {
				Double rad = scan.nextDouble();
				Circle cir = new Circle(rad);
				System.out.println("The area of your circle is...");
				System.out.println(cir.getArea());
				System.out.println("The circumference of your cirle is...");

				System.out.println(cir.getFormattedCircumference());
			} catch (Exception e) {
				System.out.println("Sorry that didn't work! Please enter a number!");
				e.printStackTrace();
			} finally {

				System.out.println("Would you like to continue?");
				userChar = scan.next().charAt(0);
			}
		}
		System.out.println("Goodbye!");
	}

}
