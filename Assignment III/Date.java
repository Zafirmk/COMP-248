// -------------------------------------------------------
// Assignment 3 Question 2 (Date class file)
// Written by: Zafir Mohammad Khalid 40152164
// For COMP 248 W – Winter 2020
// --------------------------------------------------------

/*
 * The following class file is for an Date class
 * It is also used in the employee class
 * The date class stores the day, month and year for a particular date
 * It has various functions such as getters, setters and validation checking methods
 * as well as a method to check if two dates might be equal.
 */
public class Date {
	
	//Array storing the months in strings, used to convert integer month to string
	private final String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	//Attributes of the Date class
	private int day;
	private String month;
	private int year;

	//Constructor 1
	//Initiates the attributes with default valid values
	public Date() {
		day = 1;
		month = "January";
		year = 1000;
	}
	
	//Constructor 2
	//Initiates the attributes with user input values for month, day and year
	//Constructor 2 takes in month as a String
	public Date(String monthString, int day, int year) {
		if(dateOK(monthString, day, year)) {
			this.month = monthString;
			this.day = day;
			this.year = year;	
		}
		else {
			System.out.println("Error, Invalid date.");
			System.exit(0);
		}
	}
	
	//Constructor 3
	//Initiates the attributes with user input values for month, day and year
	//Constructor 3 takes in month as an Integer
	public Date(int monthInt, int day, int year) {
		if(dateOK(monthString(monthInt), day, year)) {
			this.month = monthString(monthInt);
			this.day = day;
			this.year = year;
		}
		else {
			System.out.println("Error, Invalid date.");
			System.exit(0);
		}
	}
	
	//Checks to see if a date is exactly equal to another date
	//ie: Checks to see if the month, day and year of a date is equal to another dates corresponding month, day and year.
	public boolean equals(Date otherDate) {
		return((this.month == otherDate.month)&&(this.day == otherDate.day)&&(this.year == otherDate.year));
	}
	
	//Returns the String equivilent of an integer month (By accessing the array defined)
	private String monthString(int monthNum) {
		return(months[monthNum-1]);
	}
	
	//Checks to see if date is valid or not
	//ie: Checks day range for certain months to be between 1 and 31, for other months to be between 1 and 30
	//also checks to see if the year is a leap year and if february is between 1 and 29 or 1 and 28
	private boolean dateOK(String month, int day, int year) {
		if(year>=1000 && year<=9999) {
			switch (month) {
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
				if(day>=1 && day<=31) {
					return(true);
				}
			case "April":
            case "June":
            case "September":
            case "November":
            	if(day>=1 && day<=30) {
            		return(true);
            	}
            case "February":
            	if((year%4==0 && year%100 != 0) || (year%100 == 0 && year%400 == 0)) {
            		if(day>=0 && day<=29) {
            			return(true);
            		}
            	}
            	else if(day>=1 && day<=28) {
            		return(true);
            	}

            default:
            	return(false);
		}
	}
		else
			return(false);
	}
	
	//Used to change the date value of a date object
	//Uses all integer parameters
	public void setDate(int month, int day, int year) {
		if(dateOK(monthString(month), day, year)) {
			this.month = monthString(month);
			this.day = day;
			this.year = year;
		}	
	}
	
	//Used to change the date value of a date object
	//Uses month as a string value and the other two as integers
	public void setDate(String monthString, int day, int year) {
		if(dateOK(monthString, day, year)) {
			this.month = monthString;
			this.day = day;
			this.year = year;	
		}	
	}
	
	//Returns the day of a particular date object as integer
	public int getDay() {
		return(this.day);
	}
	
	//Returns the month of a particular date object as an integer
	public int getMonth() {
		int i = 0;
		for(;i<=11;i++) {
			if(months[i].equals(this.month)) {
				break;
			}
		}
		return(i+1);
	}
	
	//Returns the year of a particular date object as an integer
	public int getYear() {
		return(this.year);
	}
	
	//Changes the day value of a particular date object
	public void setDay(int day) {
		this.day = day;
	}
	
	//Changes the month value of a particular date object using an integer month input
	public void setMonth(int month) {
		this.month = months[month];
	}
	
	//Changes the month value of a particular date object using a string month input
	public void setMonth(String month) {
		this.month = month;
	}
	
	//Changes the year value of a particular date object
	public void setYear(int year) {
		this.year = year;
	}
	
	//toString method to return a String of a particular date objects details
	public String toString() {
		return(month + " " + day + ", " + year);
		
	}
	
	
	
	
	
	
}
	
	
