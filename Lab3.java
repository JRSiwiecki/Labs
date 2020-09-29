/*-------------------------------------------------------------
// AUTHOR: Joseph Siwiecki
// FILENAME: Lab3.java
// SPECIFICATION: Creates a final weighted total calculator based on 3 user inputted grades.
// FOR: CS 1400- Lab #3
// TIME SPENT: 30 Minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 
{
    public static void main(String[] args) 
    {
        
    	// This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        
        // Declare three variables for HW, midterm, and final exam grades
        double hwGrade = 0, midtermGrade = 0, finalGrade = 0;
        
        // Declare a loop control variable i
        // declare retryCounter to count number of times user has entered invalid input
        int i = 0, retryCounter = 3;

        while (i <= 2 && retryCounter >= 0) 
        {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.
            //-->

            if (i == 0) 
            {
                
            	// If user hasn't provided invalid input or has reset retryCounter
            	// then don't tell them how many retries are left.
            	if (retryCounter == 3)
            	{
            		// Asks user for homework grade
                	System.out.println("\nEnter your HOMEWORK grade: ");
                	hwGrade = scanner.nextDouble();
            	}
            	
            	// if the user has provided invalid input
            	// tell them to try again and show them how many chances are left
            	else
            	{
            		System.out.println("\nEnter your HOMEWORK grade (" + retryCounter + " chance(s) left): ");
            		hwGrade = scanner.nextDouble(); 
            	}


                // Do input validation
                if (hwGrade < 0 || hwGrade > 100) 
                {
                	// Show the error message
                    System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
                    retryCounter--;
                }
                    
                
                else 
                {
                	// update loop variable and retryCountter
            		i++;
                	retryCounter = 3;
                }
                    

            }
            
            else if (i == 1)
            {
            	
            	// If user hasn't provided invalid input or has reset retryCounter
            	// then don't tell them how many retries are left.
            	if (retryCounter == 3)
            	{
            		// Asks user for midterm exam grade
                	System.out.println("\nEnter your MIDTERM EXAM grade: ");
                	midtermGrade = scanner.nextDouble();
            	}
            	
            	// if the user has provided invalid input
            	// tell them to try again and show them how many chances are left
            	else
            	{
            		System.out.println("\nEnter your MIDTERM EXAM grade (" + retryCounter + " chance(s) left): ");
            		midtermGrade = scanner.nextDouble(); 
            	}
            		
            	
            	// Input Validation
            	if (midtermGrade < 0 || midtermGrade > 100)
            	{
            		// Show the error message
            		System.out.println("[ERR] Invalid Input. A midterm exam grade should be in [0, 100].");
            		retryCounter--;
            	}
            		
            	
            	else
            	{
            		// update loop variable and retryCountter
            		i++;
                	retryCounter = 3;
            	}
            		
            }
            
            else if (i == 2)
            {
            	// If user hasn't provided invalid input or has reset retryCounter
            	// then don't tell them how many retries are left.
            	if (retryCounter == 3)
            	{
            		// Asks user for final exam grade
                	System.out.println("\nEnter your FINAL EXAM grade: ");
                	finalGrade = scanner.nextDouble();
            	}
            	
            	// if the user has provided invalid input
            	// tell them to try again and show them how many chances are left
            	else
            	{
            		System.out.println("\nEnter your FINAL EXAM grade (" + retryCounter + " chance(s) left): ");
            		finalGrade = scanner.nextDouble(); 
            	}
            	
            	// Input Validation
            	if (finalGrade < 0 || finalGrade > 200)
            	{
            		// Show the error message
            		System.out.println("[ERR] Invalid Input. A final exam grade should be in [0, 200].");
            		retryCounter--;
            	}
            		
            	
            	else
            	{
            		// update loop variable and retryCountter
            		i++;
                	retryCounter = 3;
            	}
            		
            }

            
        }

        
        // if user failed too many times, then they will have to restart program. 
        if (retryCounter > 0)
        {
        	// Calculate the weighted total by the formula showed in the PDF
            double weighted_total = (finalGrade / 200 * 50) + (midtermGrade * 0.25) + (hwGrade * 0.25);

            // Show the weighted total rounded to two decimal places
            System.out.printf("\n[INFO] Student's Weighted Total is %.2f.\n", weighted_total);
            		
            // print if student passed
            if (weighted_total >= 50) 
            	System.out.println("\n[INFO] Student PASSED the class.");
            
            // print if student failed
            else 
            	System.out.println("\n[INFO] Student FAILED the class.");
        }
        
        else
        	System.out.println("\n[ERR] You have retried 3 times. Please restart your program.");
        
        // save memory
        scanner.close();

    }  
}  
