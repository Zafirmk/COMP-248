// -------------------------------------------------------
// Assignment 3 Question 2 (Employee class file)
// Written by: Zafir Mohammad Khalid 40152164
// For COMP 248 W – Winter 2020
// --------------------------------------------------------

/*
 * The following class file is for an Employee class
 * It makes use of the Date class as well
 * The Employee class stores employee names and their hiring dates. It also has methods for various actions such as
 * getters, setters and various other methods to do specific tasks like checking the seniority of two different employees,
 * or checking to see if two employee objects are equal
 * The Employee class provides a template through which different employee objects can be created.
 */
public class Employee {
	
	//Attributes of the Employee class
	String name;
	Date hiringDate;
	
	//Constructor 1
	//Initializes attributes with default valid values
	public Employee(){
		this.name = "DefaultName";
		this.hiringDate = new Date();
	}
	
	//Constructor 2
	//Takes input values and assigns them to the attributes
	public Employee(String aName, Date aDate) {
		this.name = aName;
		this.hiringDate = aDate;
	}
	
	//Checks to see if the hiring date of one employee is equal, greater than or less than another employee.
	public int seniority(Employee e) {
		if(this.hiringDate.equals(e.hiringDate)) {
			return(0);
		}
		if((this.hiringDate.getYear()<e.hiringDate.getYear())||
				
			((this.hiringDate.getYear()==e.hiringDate.getYear())&&
			(this.hiringDate.getMonth()<e.hiringDate.getMonth()))||
			
			(this.hiringDate.getYear()==e.hiringDate.getYear())&&
			(this.hiringDate.getMonth()==e.hiringDate.getMonth())&&
			(this.hiringDate.getDay()<e.hiringDate.getDay())){
			
			return(-1);
		}
		else
			return(1);
	}
	
	
	//Checks to see if an employee is the same as another employee
	//ie: Checks to see if his/her name and date of hiring is the same.
	public boolean equals(Employee e) {
		return(this.name.equals(e.name) && this.hiringDate.equals(e.hiringDate));
	}
	
	//Method to return the name of an employee
	public String getName() {
		return(this.name);
	}
	
	//Method to return the hiring date of an employee
	public Date getHireDate() {
		return(this.hiringDate);
	}
	
	//Method to change the hiring date of an employee
	public void setHireDate(Date hireDate) {
		this.hiringDate = hireDate;
	}
	
	//Method to change the name of an employee
	public void setName(String name) {
		this.name = name;
	}

}
