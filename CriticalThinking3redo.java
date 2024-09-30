import java.util.Scanner;
//This is the CriticalThinking3 Assignment, I have revised it to be more clear and have added documentation to the assignment for legibility.

public class CriticalThinking3redo {
    public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Income variables
		double incomeWeek1;
		double incomeWeek2;
		double incomeWeek3;
		double incomeWeek4;

        //tax variables
		double taxesWeek1 = 0;
		double taxesWeek2 = 0;
		double taxesWeek3 = 0;
		double taxesWeek4 = 0;
        double totalTaxes = 0;
        double averageTaxes = 0;

        //*****WEEK 1*****
        //Ask user for income
		System.out.print("What is your income for week 1? ");
		incomeWeek1 = scnr.nextInt();

        //Determine tax bracket
        //If income is less than 500, tax is 10%
		if(incomeWeek1 < 500){
			taxesWeek1 = incomeWeek1 * 0.1;
			System.out.println("You were taxed " + taxesWeek1 + " (10%) for this week.");
			}
        //If income is between 500 and 1500, tax is 15%
		else if(incomeWeek1 >= 500 && incomeWeek1 < 1500){
			taxesWeek1 = incomeWeek1 * 0.15;
			System.out.println("You were taxed " + taxesWeek1 + " (15%) for this week.");
			}  
		//If income is between 1500 and 2500, tax is 20%
		else if(incomeWeek1 >= 1500 && incomeWeek1 < 2500){
			taxesWeek1 = incomeWeek1 * 0.20;
			System.out.println("You were taxed " + taxesWeek1 + " (20%) for this week.");
			}
		//If income is greater than or equal to 2500, tax is 25%
		else if(incomeWeek1 >= 2500){
			taxesWeek1 = incomeWeek1 * 0.25;
			System.out.println("You were taxed " + taxesWeek1 + " (25%) for this week.");
			}
		//If income is not within the above ranges, print "Invalid income."
		else{
			System.out.println("Invalid income.");
			}

		
		
		//*****WEEK 2*****
        //ask user for income
		System.out.print("\n\nWhat is your income for week 2? ");
		incomeWeek2 = scnr.nextInt();

        //Determine tax bracket
        //If income is less than 500, tax is 10%
		if(incomeWeek2 < 500){
			taxesWeek2 = incomeWeek2 * 0.1;
			System.out.println("You were taxed " + taxesWeek2 + " (10%) for this week.");
			}
		//If income is between 500 and 1500, tax is 15%
		else if(incomeWeek2 >= 500 && incomeWeek2 < 1500){
			taxesWeek2 = incomeWeek2 * 0.15;
			System.out.println("You were taxed " + taxesWeek2 + " (15%) for this week.");
			}  
		//If income is between 1500 and 2500, tax is 20%
		else if(incomeWeek2 >= 1500 && incomeWeek2 < 2500){
			taxesWeek2 = incomeWeek2 * 0.20;
			System.out.println("You were taxed " + taxesWeek2 + " (20%) for this week.");
			}
		//If income is greater than or equal to 2500, tax is 25%
		else if(incomeWeek2 >= 2500){
			taxesWeek2 = incomeWeek2 * 0.25;
			System.out.println("You were taxed " + taxesWeek2 + " (25%) for this week.");
			}
		//If income is not within the above ranges, print "Invalid income."
		else{
			System.out.println("Invalid income.");
			}

		
		
		//*****WEEK 3*********
        //ask user for income
		System.out.print("\n\nWhat is your income for week 3? ");
		incomeWeek3 = scnr.nextInt();

        //Determine tax bracket
        //If income is less than 500, tax is 10%
		if(incomeWeek3 < 500){
			taxesWeek3 = incomeWeek3 * 0.1;
			System.out.println("You were taxed " + taxesWeek3 + " (10%) for this week.");
			}
		//If income is between 500 and 1500, tax is 15%	
		else if(incomeWeek3 >= 500 && incomeWeek3 < 1500){
			taxesWeek3 = incomeWeek3 * 0.15;
			System.out.println("You were taxed " + taxesWeek3 + " (15%) for this week.");
			}  
		//If income is between 1500 and 2500, tax is 20%
		else if(incomeWeek3 >= 1500 && incomeWeek3 < 2500){
			taxesWeek3 = incomeWeek3 * 0.20;
			System.out.println("You were taxed " + taxesWeek3 + " (20%) for this week.");
			}
		//If income is greater than or equal to 2500, tax is 25%
		else if(incomeWeek3 >= 2500){
			taxesWeek3 = incomeWeek3 * 0.25;
			System.out.println("You were taxed " + taxesWeek3 + " (25%) for this week.");
			}
		//If income is not within the above ranges, print "Invalid income."
		else{
			System.out.println("Invalid income.");
			}
		
		
		
		//***** WEEK 4 ***********
        //ask for income
		System.out.print("\n\nWhat is your income for week 4? ");
		incomeWeek4 = scnr.nextInt();
        
        //Determine tax bracket
        //If income is less than 500, tax is 10%
		if(incomeWeek4 < 500){
			taxesWeek4 = incomeWeek4 * 0.1;
			System.out.println("You were taxed " + taxesWeek4 + " (10%) for this week.");
			}
		//If income is between 500 and 1500, tax is 15%	
		else if(incomeWeek4 >= 500 && incomeWeek4 < 1500){
			taxesWeek4 = incomeWeek4 * 0.15;
			System.out.println("You were taxed " + taxesWeek4 + " (15%) for this week.");
			}  
		//If income is between 1500 and 2500, tax is 20%
		else if(incomeWeek4 >= 1500 && incomeWeek4 < 2500){
			taxesWeek4 = incomeWeek4 * 0.20;
			System.out.println("You were taxed " + taxesWeek4 + " (20%) for this week.");
			}
		//If income is greater than or equal to 2500, tax is 25%
		else if(incomeWeek4 >= 2500){
			taxesWeek4 = incomeWeek4 * 0.25;
			System.out.println("You were taxed " + taxesWeek4 + " (25%) for this week.");
			}
		//If income is not within the above ranges, print "Invalid income."
		else{
			System.out.println("Invalid income.");
			}


		
		//******Monthly Income********
        //Calculate total income for the month and print it	
		double monthlyIncome = incomeWeek1 + incomeWeek2 + incomeWeek3 + incomeWeek4;
		System.out.println("\n\nYour Total income this month was:   $" + monthlyIncome);
		

        //******Monthly Taxes********
        /* total taxes testing
        System.out.println("");
        System.out.println("");
		System.out.println("taxes week 1: $" + taxesWeek1);
		System.out.println("taxes week 2: $" + taxesWeek2);
		System.out.println("taxes week 3: $" + taxesWeek3);
		System.out.println("taxes week 4: $" + taxesWeek4);
        */
		
		//total taxes calculation
		totalTaxes = taxesWeek1 + taxesWeek2 + taxesWeek3 + taxesWeek4;
	    averageTaxes = totalTaxes / 4;
        //print total taxes and average taxes
	    System.out.println("Your total taxes this month were:   $" + totalTaxes);
        System.out.println("Your average taxes per week were:   $" + averageTaxes);
        System.out.println("");
    }
}
