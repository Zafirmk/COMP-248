// -------------------------------------------------------
// Assignment 2
// Written by: Zafir Mohammad Khalid 40152164
// For COMP 248 Section W – Winter 2020
// --------------------------------------------------------

/*
The program below calculates the total cost of a taxi ride in Montreal.
It does so by taking in user input for things like car model, distance, time and day.
The estimator works by using a base fare and different rates for time and day
The product of (base_fare * rush hour ratio * distance) gives the final amount
*/ 


import java.util.Scanner;
public class Question1 {
	public static void main(String args[]) {
		
		//Prin34ting a welcome message
		System.out.println("-------****-------****-------****-------****-----****-----");
		System.out.println("	Welcome to Montreal Taxi Fare Estimator!"	);
		System.out.println("-------****-------****-------****-------****-----****-----");
		System.out.println("");
		
		Scanner myKeyboard = new Scanner(System.in); //Initiating a scanner object
		double total_fare; //double variable that stores the final payable amount
		
		//Printing options for car model
		System.out.println("Please select your taxi car model:");
		System.out.println("	1 - base car");
		System.out.println("	2 - limo car");
		System.out.println("");
		System.out.println("Please enter the digit corresponding to your case:(1 or 2) ");
		
		int car_selection = myKeyboard.nextInt(); //Take in user input for car model
		
		
		//Selection statement to choose which base fare to select based on car model
		if (car_selection == 1)
			total_fare = 0.81;
		else
			total_fare = 1.55;
		
		//Printing options for day
		System.out.println("Please select the day you will be using the taxi servie:");
		System.out.println("	1 - Weekday");
		System.out.println("	2 - Weekend");
		System.out.println("");

		
		
		int day_selection = myKeyboard.nextInt(); // Take in user input for the day
		
		
		//Printing options for time based on day_selection == 1 (Weekday)
		if (day_selection == 1) {
			System.out.println("Please select the time you will be using the taxi service:");
			System.out.println("	1 - During 8am - 10am and 4pm - 5pm");
			System.out.println("	2 - From midnight 12am to 6am");
			System.out.println("	3 - None of the above");
			System.out.println("");

			
			int time_selection = myKeyboard.nextInt(); // Take in user input for the time (Weekday)
			
			//Selection statement to choose which ratio to apply to the total fare (Weekday)
			if (time_selection == 1)
				total_fare = total_fare * 1.50;
			if (time_selection == 2)
				total_fare = total_fare * 2.00;
			if (time_selection == 3)
				total_fare = total_fare * 1.00;
		}
		
		//Printing options for time based on day_selection == 2 (Weekend)
		if (day_selection == 2) {
			System.out.println("Please select the time you will be using the taxi service:");
			System.out.println("	1 - Between midnight 12am and 6am");
			System.out.println("	2 - None of the above");
			
			int time_selection = myKeyboard.nextInt(); // Take in user input for the time (Weekend)
			
			//Selection statement to choose which ratio to apply to the total fare (Weekend)
			if (time_selection == 1)
				total_fare = total_fare * 2.00;
			if (time_selection == 2)
				total_fare = total_fare * 1.30;
		}
		
		//Printing statement to take in total distance of the ride
		System.out.println("Please enter the estimated distance (km) of your ride: ");
		float distance = myKeyboard.nextFloat(); // Store the distance input by the user
		
		total_fare = total_fare * distance; // Calculate the total fare amount (base_fare * rush hour ratio * distance)
		
		
		System.out.println("Your estimated fare is $" + total_fare); // Print the final fare amount and a closing statement
		System.out.println("Thank you for using our service!");
		
		
		
		myKeyboard.close();
		
		
		
		
		
	}

}
