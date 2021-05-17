// -------------------------------------------------------
// Assignment 2
// Written by: Zafir Mohammad Khalid 40152164
// For COMP 248 Section W – Winter 2020
// --------------------------------------------------------

/*
The program below calculates takes an input number and prints the reverse of it
It also prints the number of digits in the input number
The program does so by isolating the right most digit and placing it into another variable (reversedNumber)
To reversedNumber the next right most digit is appended, until each digit is individually appended in the reverse order,
and therefore the reverse of the number is obtained. For negative numbers, the algorithm first converts it to a positive and carries out the 
procedure.
For numbers ending in zeros (ie: zeros following the last non-zero digit), the algorithm counts the number of zeros and then using a for loop 
adds them to a string of zeros. This string is then concatenated to the final reversed number and displayed.
*/


import java.util.Scanner;  // Import the java Scanner to get user input
public class Question2 {
	public static void main(String args[]) {
		
		
		//Printing the welcome message
		System.out.println("Welcome to Our Reversing Number Program");
		System.out.println("------------------------------------------");
		System.out.println("");
		
		
		//Creating a Scanner object to get user input
		Scanner myKeyboard = new Scanner(System.in);
		
		//repeat boolean to keep track of if the user wants to enter another number
		boolean repeat = true;
		
		//response variable to take the user input when prompted to enter if user wants to repeat
		String response;
		
		//modifiedInputNumber stores the temporary values of the reversed number
		long modifiedInputNumber;

		//Start of the main loop which repeats if the user wants to try again
		while(repeat==true) {
			
			//Empty string variable that stores the number of zeros a number ends with
			String zeros = "";
			System.out.println("Enter a number with at most 10 digits:");
			
			//Stores the user input for the number
			long inputNumber = myKeyboard.nextLong();
			
			//Checks to see if number is +ve or -ve, if -ve number is converted to positive and stored in modifiedInputNumber
			if (inputNumber < 0)
				modifiedInputNumber = -1 * inputNumber;
			else
				modifiedInputNumber = inputNumber;
			
			//Stores the reversed number as a long
			long reversedNumber = 0;
			
			//Stores the number of digits in the inputNumber
			int digits = 0;
			
			//Stores the isolated right most digit
			int rightMostDigit;
			
			//Stores the number of zeros after the last non-zero digit
			int zerosFromRight = 0;
			
			//Boolean to check if the digit from the right is still a 0
			boolean fromRightStillZero = true;
			
			//Loop to reverse the number
			while(modifiedInputNumber != 0) {
				//Isolates the right most digit using modulus
				rightMostDigit = (int)modifiedInputNumber % 10;
				
				//If the right most digit is still a 0, adds 1 to zerosFromRight
				if (fromRightStillZero == true)
					if(rightMostDigit == 0)
						zerosFromRight++;
					else
						fromRightStillZero = false;
				
				//Append the isolated digit to the reversedNumber variable
				reversedNumber = (reversedNumber*10)+rightMostDigit;
				//Remove the last digit that was already added from the modifiedInputNumber variable
				modifiedInputNumber = modifiedInputNumber / 10;
				//Increment the digit variable for each loop ie: For each number that is removed.
				digits++;
				
			}

			//For loop that creates a string of 0s of length zerosFromRight			
			for (int x = 1; x<=zerosFromRight; x++) {
				zeros += "0";
			}

			
			//Final output to console that displays the number of digits, and the reversed number
			System.out.println("Number of digits is " + digits);
			if (inputNumber < 0)
				System.out.println("Reverse of "+ inputNumber + " is -" + zeros + reversedNumber);
			else
			System.out.println("Reverse of "+ inputNumber + " is "+ zeros + reversedNumber);
			
			//Takes in user response if they want to try another number
			System.out.println("Do you want to try another number? (yes to repeat, no to stop)");
			response = myKeyboard.next();
			
			
			
			//Checks user response to see if they want to try another number
			//A while loop is in place to ensure only correct response is given by the user
			if(response.equals("no"))
				repeat = false;
			else if(response.equals("yes"))
				repeat = true;
			else
				while(!((response).equals("yes")|(response).equals("no"))) {
					System.out.println("Invalid response, please try again.");
					response = myKeyboard.next();

				}
		}
		
		
		//Final closing message
		System.out.println("Thanks and have a great day!");
		
		//Closing scanner object
		myKeyboard.close();
		
	}
	
}