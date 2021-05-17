// -------------------------------------------------------
// Assignment 3 Question 2 (Driver File)
// Written by: Zafir Mohammad Khalid 40152164
// For COMP 248 Section W – Winter 2020
// --------------------------------------------------------

/*
 * The following class file is the driver file that makes use of the employee and date classes.
 * It shows an example of creating a new employee and how their attributes can be printed.
 * It also shows how seniority of two employees may be compared
 * as well as the differences between the .equals method and == 
 */

public class Question2 {
	public static void main(String args[]) {
		
		
		//Creation of 3 employees where e1 and e3 have identical attributes
		Employee e1 = new Employee("Zafir", new Date("January",1,2010));
		Employee e2 = new Employee("Khalid", new Date("December",1,2010));
		Employee e3 = new Employee ("Zafir", new Date("January",1,2010)); 

		//Printing details of e1
		System.out.println("The first employee (e1):");
		System.out.println(e1.getName() +" "+e1.getHireDate());
		
		System.out.println();
		
		//Printing details of e2
		System.out.println("The second employee (e2):");
		System.out.println(e2.getName() +" "+e2.getHireDate());
		
		System.out.println();
		
		//Checking to see if e1 is more senior to e2 and printing a relevant response
		if(e1.seniority(e2)==-1) {
			System.out.println(e1.getName() + " is more senior than " + e2.getName());
		}
		else if(e1.seniority(e2)==1) {
			System.out.println(e2.getName() + " is more senior than " + e1.getName());
		}
		else {
			System.out.println(e1.getName() + " and " + e2.getName() + " were hired on the same day");
		}
		
		System.out.println();
		
		//Printing details of e3
		System.out.println("The duplicated employee (e3):");
		System.out.println(e3.getName() +" "+ e3.getHireDate());
		
		System.out.println();
		
		//Printing statements using .equals and ==
		System.out.println("e1.equals(e3) => " + e1.equals(e3));
		System.out.println("e2.equals(e3) => " + e2.equals(e3));
		System.out.println("(e1 == e3) => " + (e1==e3));
		System.out.println("(e2 == e3) => " + (e2==e3));
		
	}

}
