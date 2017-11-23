/*
 * package buber;
 

import java.util.Scanner;

public class BuberApp {

	static Scanner s = new Scanner(System.in);

	static void mainMenu() {
		System.out.println("\n\tWELCOME TO BUBER");
		System.out.println("");
		// choices();
		System.out.println("Please select any of the choices below");
		System.out.println("[V]iew bikes  [a]dd bike  [r]ent bike [Q]uit [b]ack");

		// System.out.println("'b' to go back to main screen");
		System.out.println("");

	}

	static void execute() {
		UserAccount u = new UserAccount();
		char option = ' ';

		while (option != 'q') {
			mainMenu();

			// System.out.println("[b]ack to main menu");

			String input = s.nextLine();
			option = input.toLowerCase().charAt(0);

			switch (option) {

			case 'b':
				mainMenu();
				break;

			case 'r':
				u.rentBike();
				break;

			case 'v':
				u.viewBy();
				break;

			case 'a':
				u.userCreateBike();
				break;

			case 'q':
				u.quit();
			}
		}
	}

	public static void main(String[] args) {
		// mainMenu();
		// choices();
		execute();
	}
}
*/