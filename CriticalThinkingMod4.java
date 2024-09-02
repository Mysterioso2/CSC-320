	/*Mason Fulling
	 9/2/2024
	 CSUG - CSC320
	 Critical Thinking Module 4 Option 2
	 */
	
	
	
	 /*                              Assignment information
	       Write a program that will provide important statistics for the grades in a class. 
	       The program will utilize a for-loop to read ten floating-point grades from user input. 
	       Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:
	        Average
	        Maximum
	        Minimum
	        Compile and submit your pseudocode, source code, and screenshots of the application executing the application, 
	        the results and GIT repository in a single document.
	        
	        */

import java.util.ArrayList;
import java.util.Scanner;
public class CriticalThinkingMod4 {
	



	
	
	
	    public static void main(String[] args) {
	        Scanner scnr = new Scanner(System.in);
	        int gradeCount = 0;
	        int gradeNum;
	        ArrayList<Double> grades = new ArrayList<Double>();
	        //for loop
	        for (int i = 0; i < 10; i++) {
	            gradeNum = i + 1;
	            System.out.print("Please enter grade " + gradeNum + ": ");
	            double grade = scnr.nextDouble();
	            if (grade < 0 || grade > 100) {
	                System.out.println("Invalid grade. Please re-enter grade " + gradeNum + " with a value grade between 0 and 100.");
	                i--;
	                continue;
	            }
	            grades.add(grade);
	            /* printing grades just for array testing purposes
	            System.out.println("The grades currently recorded are: " + grades);
	            */
	            gradeCount++;
	            if (gradeCount == 10)break;
	            System.out.println("");
	            
	        }
	        //for loop testing:
	        //System.out.println("for loop exited");
	        //System.out.println(gradeCount + " grades have been submitted.");
	
	        //Calculate sum
	        
	        double sum = grades.get(0) + grades.get(1) + grades.get(2) + grades.get(3) + grades.get(4) + grades.get(5) + grades.get(6) + grades.get(7) + grades.get(8) + grades.get(9);
	        
	        //Calculate average and print
	        double average = sum / 10;
	        System.out.println("\n\nThe average of the score is " + average + "%");
	
	        //Calculate min and max and print
	        double max = Math.max(grades.get(0), Math.max(grades.get(1), Math.max(grades.get(2), Math.max(grades.get(3), Math.max(grades.get(4), Math.max(grades.get(5), Math.max(grades.get(6), Math.max(grades.get(7), Math.max(grades.get(8), grades.get(9))))))))));
	        System.out.println("The maximum grade was " + max + "%");
	        double min = Math.min(grades.get(0), Math.min(grades.get(1), Math.min(grades.get(2), Math.min(grades.get(3), Math.min(grades.get(4), Math.min(grades.get(5), Math.min(grades.get(6), Math.min(grades.get(7), Math.min(grades.get(8), grades.get(9))))))))));
	        System.out.println("The minimum grade was " + min + "%\n\n");
	        
	        
	        
	        
	        scnr.close();
	    }
	    
}

