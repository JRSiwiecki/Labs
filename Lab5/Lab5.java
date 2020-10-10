/*-------------------------------------------------------------
// AUTHOR: Joseph Siwiecki
// FILENAME: Lab5.java
// SPECIFICATION: 
// FOR: CS 1400 Lab 5
// TIME SPENT: 15 Minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sFirstname, sLastname, sBroncoId;
        double sGrade;
        String pName, pDesc, pFname;
        
        // Read some input data
        System.out.println("The student's first name?"); 
        sFirstname = scan.nextLine();
        System.out.println("The student's last name?"); 
        sLastname = scan.nextLine();
        System.out.println("The student's Bronco Id?"); 
        sBroncoId = scan.nextLine();
        System.out.println("Program name?"); 
        pName = scan.nextLine();
        System.out.println("Program desc?"); 
        pDesc = scan.nextLine();
        System.out.println("Program filename?"); 
        pFname = scan.nextLine();
        System.out.println("Program grade?"); 
        sGrade = scan.nextDouble(); 
        scan.nextLine();
        System.out.println(""); 
        scan.close();
        
        
        // Create a Student object "student1"
        Student student1 = new Student(sFirstname, sLastname, sBroncoId);
        System.out.println("Making a student record\n...[" + student1 + "]");
        
        // Use the setGrade setter to set student1's grade
        student1.setGrade(sGrade);
        
        // Create a Program object "program1" by "student1"
        Program program1 = new Program(pName, pDesc, pFname, student1);
        System.out.println("Making a program record\n...[" + program1 + "]");
        
        // Produce a report with the information below by using a helper method. The specification is provided in the UML class diagram
        System.out.println("\n========== Program Submission Detail ==========");
        System.out.println(String.format("%-12s: %-10s", "Student", program1.getAuthor().getFullName()));
        System.out.println(String.format("%-12s: %-10s", "Bronco ID", program1.getAuthor().getBroncoId()));
        System.out.println(String.format("%-12s: %-10s", "Grade", "" + program1.getAuthor().getGrade()));
        System.out.println("");
        System.out.println(String.format("%-12s: %-10s", "Program", program1.getProgramName()));
        System.out.println(String.format("%-12s: %-10s", "Filename", program1.getFileName()));
        System.out.println(String.format("%-12s: %-10s", "Description", program1.getDescription()));
        System.out.println(String.format("%-12s: %-10s", "Datetime", program1.getCreatedDate()));
    }
}