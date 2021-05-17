// --------------------------------------------------------
// Assignment 1, Question 1
// Written by: Zafir Mohammad Khalid (40152164)
// Date: 22/01/2020
// For COMP 248 Section W – Winter 2020
// --------------------------------------------------------

// The program below calculates the sum and product of two fractions inputed by the user.

import java.util.Scanner;


public class Question1 {
	public static void main(String args[]) {
		// Creating a Scanner object to get user input
		// myKeyboard is the variable name for the Scanner Object
		Scanner myKeyboard = new Scanner(System.in);
		
		//Prints opening display
		System.out.println("\\-------------------\\");
		System.out.println("/FRACTION MULTIPLIER/");
		System.out.println("\\-------------------\\");
		
		//Appropriate message that asks the user to enter the numerator and denominators.
		System.out.println("Enter numerators and non-zero denominators");
		
		System.out.println("* for the 1st fraction: ");
		// Gets user input using .nextInt() and 
		// stores the numerator and denominator for the first fraction in numerator1 and denominator2 respectively.
		int numerator1 = myKeyboard.nextInt();
		int denominator1 = myKeyboard.nextInt();
		
		System.out.println("* for the 2nd fraction: ");
		// Gets user input using .nextInt() and 
		// stores the numerator and denominator for the second fraction in numerator2 and denominator2 respectively.
		int numerator2 = myKeyboard.nextInt();
		int denominator2 = myKeyboard.nextInt();
		
		//Calculates and stores the products of the numerator and denominator individually in separate variables.
		//sub_product_numerator stores the product of the two numerators
		//sub_product_denominator stores the product of the two denominators
		int sub_product_numerator = numerator1*numerator2;
		int sub_product_denominator = denominator1*denominator2;
		
		//Creates a common denominator for the fractions and adds the resulting numerators.
		int added_numerators = (denominator2*numerator1)+(denominator1*numerator2);
		
		//Converts and stores the final product and sum values into doubles.
		double product = (1.0*sub_product_numerator)/(1.0*sub_product_denominator);
		double sum = (1.0*numerator1/denominator1)+(1.0*numerator2/denominator2);
		
		//Output to display the product, sum and a final message.
		System.out.println("The product of " + numerator1 + "/" + denominator1 + " and " + numerator2 + "/" + denominator2 + " is " + sub_product_numerator + "/" + sub_product_denominator + " or " + product);
		System.out.println("The sum of " + numerator1 + "/" + denominator1 + " and " + numerator2 + "/" + denominator2 + " is " + added_numerators + "/" + sub_product_denominator + " or " + sum);
		
		//Closing the Scanner object that was created to avoid memory leak ie: closing myKeyboard
		myKeyboard.close();
		
		System.out.println("All done!!!");

		
		
	}

}
