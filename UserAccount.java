
/*
 * package buber;
 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserAccount {

	// static Scanner s = new Scanner(System.in);
	static String name, pickuptime, dropofftime;
	static double price;

	//static ArrayList<CreateBike> userbike = new ArrayList<CreateBike>();
	//static ArrayList<CreateBike> rentedbike = new ArrayList<CreateBike>();

	void enterbikename() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Bike name: ");
		name = s.nextLine();
	}

	void enterbikeprice() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the price: ");
		price = s.nextDouble();
	}

	// user create bike and sets a price
	void userCreateBike() {

		enterbikename();
		enterbikeprice();

		Bike b = new Bike(name, price);
		userbike.add(b);

		System.out.println("Bike had been added for the people to rent");
	}

	static void getBikeInfo() // displays bike name and price
	{
		for (Bike b : userbike) {
			System.out.println(b.getUserBike());
		}

	}

	static void getRentedBikeInfo() {
		for (Bike r : rentedbike) {
			System.out.println(r.getUserBike());
		}
	}

	static void viewBy() {
		Scanner s = new Scanner(System.in);
		System.out.println("[a]vailable bikes \t [r]ented bikes \t [b]ack");

		String a = s.nextLine();
		// String r=s.nextLine();

		if (a.equalsIgnoreCase("a")) {
			if (userbike.isEmpty()) {
				System.out.println("No bikes are available, Please try again later");
			} else {
				System.out.println("Bike  \tPrice");
				getBikeInfo();
			}
		} else if (a.equalsIgnoreCase("r")) {
			if (rentedbike.isEmpty()) {
				System.out.println("No bikes have been rented yet");
			}
			getRentedBikeInfo();
		} else if (a.equalsIgnoreCase("b")) {
			BuberApp.mainMenu();
		} else {
			System.out.println("Please select a correct option");
		}

	}

	public static void checkTime(String timein) {
		if (timein.matches(("[01]?[0-9]|2[0-3]:[0-5][0-9]"))) {
			try {

				SimpleDateFormat fmt = new SimpleDateFormat("HH:mm");
				Date thetime = fmt.parse(timein);
				Calendar cal = Calendar.getInstance();
				cal.setTime(thetime);

			} catch (ParseException e) {
				System.out.println("Incorrect format!");
				e.printStackTrace();
			}
		}

	}

	static void rentBike() {
		Scanner s = new Scanner(System.in);
		System.out.println("type the name of the bike to rent");
		String rent = s.nextLine();

		System.out.println("Please enter pick up time (HH:mm 24hour-format): ");
		pickuptime = s.nextLine();
		checkTime(pickuptime);

		int hour = Integer.parseInt(pickuptime.substring(0, 2));
		int min = Integer.parseInt(pickuptime.substring(3));

		int newhour = hour + 1;

		System.out.println("your rented bike is due at: " + newhour + ":" + min);

		for (int i = 0; i < userbike.size(); i++) {
			if (userbike.get(i).getbikename().equalsIgnoreCase(rent)) {
				rentedbike.add(userbike.get(i));
				userbike.remove(i);

			}
		}

		System.out.println("bike has been rented");

		getRentedBikeInfo();

	}

	// quitapp
	void quit() {
		System.exit(0);
	}

}
*/