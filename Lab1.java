/*-------------------------------------------------------------------------
// AUTHOR: Joseph Siwiecki
// FILENAME: Lab1
// SPECIFICATION: Calculates average test grade from 3 test scores inputted from the user.
// FOR: CS 1400- Lab #1
// TIME SPENT: 5 Minutes
//-----------------------------------------------------------*/

// All imports have to be included outside the public class
// import the Scanner class from the java.util library
import java.util.Scanner;

// class name should match the file name
public class Lab1 
{
	// we must have a main method to run the program
	public static void main(String[] args)
	{

		// create a Scanner object to get input from the keyboard
		Scanner input = new Scanner(System.in);


		// declare variables 
		/*  creates 3 ints that will hold user input, a constant that will hold the number of tests, 
		    and a double that will hold the average of the 3 test scores. */
		int test1, test2, test3;
		final int NUM_TESTS = 3;
		double average;
		

		// Get the Input for the three tests
		System.out.print("Enter the score on the first test: ");
		test1 = input.nextInt();
		System.out.print("\nEnter the score on the second test: ");
		test2 = input.nextInt();
		System.out.print("\nEnter the score on the third test: ");
		test3 = input.nextInt();

		// Calculate the average of the three test scores
		average = (test1 + test2 + test3) / (double) NUM_TESTS;


		// Display the average result of the three test scores
		System.out.println("\nYour average score for three tests is " + average + ".");
		
		input.close();


	}//end main method
}//end Lab1 class
