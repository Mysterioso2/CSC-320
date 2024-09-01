//Mason Fulling
//CSU Global
//CSC 320 - Professor C. Whitfield
//Critical Thinking Assignment 3 - Option 1 Calculate Average Withholding


import java.util.Scanner;


public class CriticalThinking3v2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double incomeWeek1;
		double incomeWeek2;
		double incomeWeek3;
		double incomeWeek4;
		
		double taxesWeek1 = 0;
		double taxesWeek2 = 0;
		double taxesWeek3 = 0;
		double taxesWeek4 = 0;

		System.out.print("What is your income for week 1? ");
		incomeWeek1 = scnr.nextDouble();
		if(incomeWeek1 < 500){
			taxesWeek1 = incomeWeek1 * 0.1;
			System.out.println("You were taxed $" + taxesWeek1 + " (10%) for this week.\n");
			}

		else if(incomeWeek1 >= 500 && incomeWeek1 < 1500){
			taxesWeek1 = incomeWeek1 * 0.15;
			System.out.println("You were taxed $" + taxesWeek1 + " (15%) for this week.\n");
			}  
		
		else if(incomeWeek1 >= 1500 && incomeWeek1 < 2500){
			taxesWeek1 = incomeWeek1 * 0.20;
			System.out.println("You were taxed $" + taxesWeek1 + " (20%) for this week.\n");
			}
		
		else if(incomeWeek1 >= 2500){
			taxesWeek1 = incomeWeek1 * 0.25;
			System.out.println("You were taxed $" + taxesWeek1 + " (25%) for this week.\n");
			}
		
		else{
			System.out.println("Invalid income.");
			}

		
		
		//*****WEEK 2*****
		System.out.print("What is your income for week 2? ");
		incomeWeek2 = scnr.nextDouble();
		if(incomeWeek2 < 500){
			taxesWeek2 = incomeWeek2 * 0.1;
			System.out.println("You were taxed $" + taxesWeek2 + " (10%) for this week.\n");
			}
			
		else if(incomeWeek2 >= 500 && incomeWeek2 < 1500){
			taxesWeek2 = incomeWeek2 * 0.15;
			System.out.println("You were taxed $" + taxesWeek2 + " (15%) for this week.\n");
			}  
		
		else if(incomeWeek2 >= 1500 && incomeWeek2 < 2500){
			taxesWeek2 = incomeWeek2 * 0.20;
			System.out.println("You were taxed $" + taxesWeek2 + " (20%) for this week.\n");
			}
		
		else if(incomeWeek2 >= 2500){
			taxesWeek2 = incomeWeek2 * 0.25;
			System.out.println("You were taxed $" + taxesWeek2 + " (25%) for this week.\n");
			}
		
		else{
			System.out.println("Invalid income.");
			}

		
		
		//*****WEEK 3*********
		System.out.print("What is your income for week 3? ");
		incomeWeek3 = scnr.nextDouble();
		if(incomeWeek3 < 500){
			taxesWeek3 = incomeWeek3 * 0.1;
			System.out.println("You were taxed $" + taxesWeek3 + " (10%) for this week.\n");
			}
			
		else if(incomeWeek3 >= 500 && incomeWeek3 < 1500){
			taxesWeek3 = incomeWeek3 * 0.15;
			System.out.println("You were taxed $" + taxesWeek3 + " (15%) for this week.\n");
			}  
		
		else if(incomeWeek3 >= 1500 && incomeWeek3 < 2500){
			taxesWeek3 = incomeWeek3 * 0.20;
			System.out.println("You were taxed $" + taxesWeek3 + " (20%) for this week.\n");
			}
		
		else if(incomeWeek3 >= 2500){
			taxesWeek3 = incomeWeek3 * 0.25;
			System.out.println("You were taxed $" + taxesWeek3 + " (25%) for this week.\n");
			}
		
		else{
			System.out.println("Invalid income.");
			}
		
		
		
		//***** WEEK 4 ***********
		System.out.print("What is your income for week 4? ");
		incomeWeek4 = scnr.nextDouble();
		if(incomeWeek4 < 500){
			taxesWeek4 = incomeWeek4 * 0.1;
			System.out.println("You were taxed $" + taxesWeek4 + " (10%) for this week.\n");
			}
			
		else if(incomeWeek4 >= 500 && incomeWeek4 < 1500){
			taxesWeek4 = incomeWeek4 * 0.15;
			System.out.println("You were taxed $" + taxesWeek4 + " (15%) for this week.\n");
			}  
		
		else if(incomeWeek4 >= 1500 && incomeWeek4 < 2500){
			taxesWeek4 = incomeWeek4 * 0.20;
			System.out.println("You were taxed $" + taxesWeek4 + " (20%) for this week.\n");
			}
		
		else if(incomeWeek4 >= 2500){
			taxesWeek4 = incomeWeek4 * 0.25;
			System.out.println("You were taxed $" + taxesWeek4 + " (25%) for this week.\n");
			}
		
		else{
			System.out.println("Invalid income.");
			}


		
		//monthly income		
		double monthlyIncome = incomeWeek1 + incomeWeek2 + incomeWeek3 + incomeWeek4;
		System.out.println("Your Total income this month was $" + monthlyIncome);
		
		
		/*total taxes testing
		System.out.println("taxes week 1: $" + taxesWeek1);
		System.out.println("taxes week 2: $" + taxesWeek2);
		System.out.println("taxes week 3: $" + taxesWeek3);
		System.out.println("taxes week 4: $" + taxesWeek4);
		*/

		double totalTaxes = taxesWeek1 + taxesWeek2 + taxesWeek3 + taxesWeek4; 
		double averageTaxes = totalTaxes / 4;
		System.out.println("Your total taxes this month were $" + totalTaxes);
		System.out.println("Your average taxes per week for this month were $" + averageTaxes);
		
		
		
		
	}

}
