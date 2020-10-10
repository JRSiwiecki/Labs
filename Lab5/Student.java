/*-------------------------------------------------------------
// AUTHOR: Joseph Siwiecki
// FILENAME: Student.java
// SPECIFICATION: Student class
// FOR: CS 1400 Lab 5
// TIME SPENT: 15 Minutes
//-----------------------------------------------------------*/

public class Student 
{
	// instance variables
	private String firstName, lastName, fullName, broncoId;
	private double grade;
	
	// constructor
	public Student(String fname, String lname, String broncoId)
	{
		firstName = fname;
		lastName = lname;
		fullName = fname + " " + lname;
		this.broncoId = broncoId;
		grade = -1.0;
	}
	
	 public String toString() 
	 {
	     return String.format("Student: %s, Bronco ID: %s, Grade: %.2f",
	             fullName, broncoId, grade);
	 }
	 
	 // getters/setters
	 public String getFirstName() 
	 {
		 return firstName;
	 }
	 
	 public String getLastName() 
	 {
		 return lastName;
	 }
	 
	 public String getFullName() 
	 {
		 return fullName;
	 }
	 
	 public String getBroncoId() 
	 {
		 return broncoId;
	 }
	 
	 public double getGrade()
	 {
		 return grade;
	 }
	 
	 public void setGrade(double newGrade)
	 {
		 this.grade = newGrade;
	 }
	 
	 
}
