// --------------------------------------------------------
// Assignment 1, Question 2
// Written by: Zafir Mohammad Khalid (40152164)
// Date: 22/01/2020
// For COMP 248 Section W – Winter 2020
// --------------------------------------------------------

// The program below takes the user input of a single word city name and then outputs:
// The number of letters in the city name
// The city name in upper case characters
// The city name with only the second letter capitalized
// The city name with the second last letter capitalized


import java.util.Scanner;
public class Question2 {
	public static void main(String args[]){
		
		// Creating a Scanner object to get user input
		// myKeyboard is the variable name for the Scanner Object
		Scanner myKeyboard = new Scanner(System.in);
		
		// Printing an opening message display
		System.out.println("Zafir's city name manipulator");
		System.out.println("-----------------------------");
		
		// Asking the user to enter their favorite city's name
		System.out.println("Enter the name of your favorite single word city in lowercase letters: ");
		String user_city = myKeyboard.next();
		
		// num_of_letters stores the number of characters in the city name
		// middle_index stores the index at which the middle character is
		int num_of_letters = user_city.length();
		int middle_index = num_of_letters/2;
		
		// Selecting specific letters and capitalizing them
		// middle letter
		// second letter
		// second last letter
		String capital_middle_letter = user_city.substring(middle_index, middle_index+1).toUpperCase();
		String capital_second_letter = user_city.substring(1,2).toUpperCase();
		String capital_secondlast_letter = user_city.substring(num_of_letters-2, num_of_letters-1).toUpperCase();
		
		
		// Printing out city names with modifications, ie:
		// All capital
		// Second letter capital
		// Second last letter capital
		// Middle letter capital
		System.out.println("You entered " + user_city + " which has " + num_of_letters + " characters.");
		System.out.println("Here is the city name");
		System.out.println("     *With all letters in upper case: " + user_city.toUpperCase());
		System.out.println("     *With the second letter in upper case: " + user_city.substring(0,1) + capital_second_letter + user_city.substring(2,num_of_letters));
		System.out.println("     *With the second to last letter in upper case: " + user_city.substring(0,num_of_letters-2) + capital_secondlast_letter + user_city.substring(num_of_letters-1));
		System.out.println("     *With the middle letter in upper case: " + user_city.substring(0, num_of_letters/2) + capital_middle_letter + user_city.substring((num_of_letters/2)+1));
		
		//Printing a closing statement to let user know everything ran correctly.
		System.out.println("Program ran successfully, all done!");
		
		//Closing the Scanner object that was created to avoid memory leak ie: closing myKeyboard
		myKeyboard.close();
		
		
		
	}
}