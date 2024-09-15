		import java.util.Scanner;

public class CriticalThinking5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scnr = new Scanner(System.in);
		        
		        //declare Array for days of the week
		        String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		        //declare Array for temperatures
		        double[] temperatures = new double[7];

		            
		        //get temperatures
		        for(int i = 0; i < daysOfWeek.length; i++){
		            System.out.print("Enter the temperature for " + daysOfWeek[i] + ": ");
		            double tempCheck = scnr.nextDouble();

		            //check if the temperature is an actual temp
		            if(tempCheck < -100 || tempCheck > 200){
		                System.out.println("Invalid temperature. Please re-enter the temperature for " + daysOfWeek[i] + " with a value between -100 and 200.");
		                i--;
		            }
		            //add temp to array
		            else if(tempCheck > -100 && tempCheck < 200){
		                temperatures[i] = tempCheck;
		            }
		            //error message
		            else{
		                System.out.println("Invalid temperature. Please re-enter the temperature for " + daysOfWeek[i] + " with a value between -100 and 200.");
		                i--;
		            }
		        }
		        

		        //calculate the average temperature
		        double sum = 0;
		        for(double temp : temperatures){
		            sum += temp;
		        }
		        double averageTemp = sum / temperatures.length;
		        averageTemp = Math.round(averageTemp * 100.00) / 100.00;
		        


		        //promt the user to view a value, "Which value would you like to view? Please enter a day (Monday - Sunday) or 'week' for the weekly average."
		        boolean exit = false;
		        while(exit == false){
		            String userValue;
		            System.out.println("\n\n Would you like to view a Temperature? \n Please type 'Monday' - 'Sunday' or 'week' to view all temperatures and the weekly average. \n (Type 'exit' to exit the program.)");
		            userValue = scnr.nextLine().toLowerCase();
		            

		            switch (userValue){
		                case "week":
		                    for(int i = 0; i < daysOfWeek.length; i++){
		                        System.out.println(daysOfWeek[i] + "'s Temperature was " + temperatures[i] + " degrees. ");
		                    }
		                    System.out.println("The weekly average temperature was " + averageTemp + " degrees.");
		                    break;

		                case "monday":
		                    System.out.println("Monday's temperature was " + temperatures[0] + " degrees.");
		                    break;

		                case "tuesday":
		                    System.out.println("Tuesday's temperature was " + temperatures[1] + " degrees.");
		                    break;

		                case "wednesday":
		                    System.out.println("Wednesday's temperature was " + temperatures[2] + " degrees.");
		                    break;

		                case "thursday":
		                    System.out.println("Thursday's temperature was " + temperatures[3] + " degrees.");
		                    break;

		                case "friday":
		                    System.out.println("Friday's temperature was " + temperatures[4] + " degrees.");
		                    break;

		                case "saturday":
		                    System.out.println("Saturday's temperature was " + temperatures[5] + " degrees.");
		                    break;

		                case "sunday":
		                    System.out.println("Sunday's temperature was " + temperatures[6] + " degrees.");
		                    break;

		                case "exit":
		                    System.out.println("\n\nBye!");
		                    exit = true;
		                    break;
		            } 

		        }
		        scnr.close();
		    } 
		}
	


