
import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;


    public class CriticalThinking8 {

    public static ArrayList<String> carModel = new ArrayList<>();
    public static ArrayList<String> carColor = new ArrayList<>();
    public static ArrayList<Integer> carYear = new ArrayList<>();
    public static ArrayList<Integer> carMileage = new ArrayList<>();
    public static ArrayList<String> carMake = new ArrayList<>();

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while(exit == false){ 
            System.out.println("******************************************************************************");
            System.out.println("*                                                                            *");  
            System.out.println("*          Welcome to the Vehicle Inventory Program.                         *");
            System.out.println("*                                                                            *");  
            System.out.println("*                                                                            *");
            System.out.println("*          Please select an option from the menu below:                      *");
            System.out.println("*                                                                            *");  
            System.out.println("*               1. List all inventory                                        *");
            System.out.println("*               2. List a single vehicle's information                       *");
            System.out.println("*               3. Add a vehicle                                             *");
            System.out.println("*               4. Remove a vehicle                                          *");
            System.out.println("*               5. Update vehicle attributes                                 *");
            System.out.println("*               6. Exit the program                                          *");
            System.out.println("*                                                                            *");  
            System.out.println("*                                                                            *");  
            System.out.println("******************************************************************************");
            int userMenuSelection = scanner.nextInt();

            switch(userMenuSelection){
                case 1:
                    allVehicles();
                    break;
                case 2:
                    listOneVehicle(carMake, carModel, carColor, carYear, carMileage);
                    break;
                case 3:
                    addVehicle(carMake, carModel, carColor, carYear, carMileage);
                    break;
                case 4:
                    removeVehicle(carMake, carModel, carColor, carYear, carMileage);
                    break;
                case 5:
                    allVehicles(carMake, carModel, carColor, carYear, carMileage);
                    updateVehicle(carMake, carModel, carColor, carYear, carMileage);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid entry. Please try again.");
                    break;
            }
        }
    }

    
    public static String addVehicle(){
        Scanner scanner = new Scanner(System.in);
        int j = carMake.size;

        String userMake;
        for (int i = 0; i < carModel.length; i++){
            System.out.print(carModel[i] + ", ");
        }
        System.out.print("\nWhat is the make of the new vehicle? Please enter a make from the list above: ");
        userMake = scanner.nextLine();
        carMake[j] = userMake;

        for (int i = 0; i < carModel.length; i++){
            System.out.print(carModel[i] + ", ");
        }
        System.out.print("\nWhat is the model of the new vehicle? Please enter a model from the list above: ");
        String userModel = scanner.nextLine();
        carModel[j] = userModel;

        for (int i = 0; i < carColor.length; i++){
            System.out.print(carColor[i] + ", ");
        }
        System.out.print("\nWhat is the color of the new vehicle?");
        String userColor = scanner.nextLine();
        carColor[j] = userColor;

        for (int i = 0; i < carYear.length; i++){
            System.out.print(carYear[i] + ", ");
        }
        System.out.print("\nWhat is the year of the new vehicle?");
        int userYear = scanner.nextInt();
        carYear[j] = userYear;

        for (int i = 0; i < carMileage.length; i++){
            System.out.print(carMileage[i] + ", ");
        }
        System.out.print("\nWhat is the mileage of the new vehicle?");
        int userMileage = scanner.nextInt();
        carMileage[j] = userMileage;

        System.out.print("Vehicle " + j + ": " + carYear[j - 1] + carMake[j - 1] + carModel[j - 1] + carColor[j - 1] + carMileage[j - 1]);
        
        System.out.println("The new vehicle has been added.");
    }
    
    //Create an automobile class that will be used by a dealership as a vehicle inventory program. 
    //The class should include private variables for make, model, color, year, and mileage.
    
    //default constructor
    //The class should include private variables for make, model, color, year, and mileage.
    
    //parameterized constructor
    /*  public static void Automobile(String make, String model, String color, int year, int mileage){
        Arraylist String[] make = {"Ford", "Chevy", "Toyota", "Honda", "Nissan", "Dodge", "Jeep", "Subaru", "BMW", "Mercedes", "Audi", "Volkswagen", "Kia"};
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    } */

    //add a new vehicle
    


    public static void listOneVehicle(String[] carMake, String[] carModel, String[] carColor, int[] carYear, int[] carMileage){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which vehicle would you like to list? Please enter a number (vehicle 1 - " + carMake.length + ")");
        int userVehicle = scanner.nextInt();
        int i = userVehicle;
        System.out.println(carYear[i] + carMake[i] + carModel[i] + carColor[i] + carMileage[i]);
    }

    public static void allVehicles(String[] carMake, String[] carModel, String[] carColor, int[] carYear, int[] carMileage){
        for (int i = 0; i < carMake.length; i++){
            System.out.print("Vehicle " + i + ": ");
            System.out.print(carYear[i] + carMake[i] + carModel[i] + carColor[i] + carMileage[i]);
            //should i return or print to console?
        }
    }
        
    //remove vehicle +++ done i think +++
    public static void removeVehicle(String[] carMake, String[] carModel, String[] carColor, int[] carYear, int[] carMileage){
        Scanner scanner = new Scanner(System.in);
        allVehicles();

        System.out.print("Which vehicle would you like to remove? Please enter a number (vehicle 1 - " + carMake.length + ")");
        String userVehicleSelection = scanner.nextInt();
        int i = userVehicleSelection;
        carMake[i] = "";
        carModel[i] = "";
        carColor[i] = "";
        carYear[i] = 0;
        carMileage[i] = 0;
        System.out.println("Vehicle " + i + " has been removed.");

    }

    
    public static void UpdateVehicle(String[] carMake, String[] carModel, String[] carColor, int[] carYear, int[] carMileage){
        Scanner scanner = new Scanner(System.in);
        int userVehicleSelection = 0;
        allVehicles();
        System.out.println("Which vehicle would you like to update? Please enter a number (vehicle 1 - " + carMake.length + ")");
        int userVehicleSelection = scanner.nextInt();
        int i = userVehicleSelection;
                
        System.out.print("what would you like to update? (carMake, model, color, year, mileage)");
        String userUpdate = scanner.nextLine().toLowerCase();
        
        switch userUpdate{
            case "carMake":
                //update carMake
                System.out.println("What would you like to update the carMake to?");
                String userMake = scanner.nextLine();
                carMake[i] = userMake;
                break;

            case "model":
                //update model
                System.out.println("What would you like to update the model to?");
                String userModel = scanner.nextLine();
                carModel[i] = userModel;
                break;

            case "color":
                //update color
                System.out.println("What would you like to update the color to?");
                String userColor = scanner.nextLine();
                carColor[i] = userColor;
                break;

            case "year":
                //update year
                System.out.println("What would you like to update the year to?");
                int userYear = scanner.nextInt();
                carYear[i] = userYear;
                break;

            case "mileage":
                //update mileage
                System.out.println("What would you like to update the mileage to?");
                int userMileage = scanner.nextInt();
                carMileage[i] = userMileage;
                break;

            default:
                //invalid entry
                System.out.println("Invalid entry. Please try again.");
                //return or print? - return message indicating the details match and no update is needed
                break;
    }


    }
    
    /* 
    Your program should have appropriate methods such as:
    - default constructor ??
    - parameterized constructor ??
    -  +++++ add a new vehicle  method 
        - finished but idk if itll work im intruiged to see how this will go over
    -  +++++ list vehicle information (return string array)
        - i have two methods for this, one to list all vehicles (allVehicles) and one to list a single vehicle (listOneVehicle) both are finished ++++ i think +++
    -  +++++ remove a vehicle method
    -  +++++ update vehicle attributes method

    All methods should include try..catch constructs. 
    Except as noted all methods should return a success or failure message (failure message defined in "catch").

Create an additional class to call your automobile class (e.g., Main or AutomobileInventory). 
Include a try..catch construct and print it to the console.

Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage").
    Then call the method to list the values. 
    Loop through the array and print to the screen.

    Call the remove vehicle method to clear the variables.
    Print the return value.

    Add a new vehicle.
    Print the return value.
    Call the list method and print the new vehicle information to the screen.

    Update the vehicle.
    Print the return value.

    Call the listing method and print the information to the screen--??
    Display a message asking if the user wants to print the information to a file (Y or N).
    Use a scanner to capture the response. 
    If "Y", 
        print the file to a predefined location (e.g., C:\Temp\Autos.txt). 
        Note: you may want to create a method to print the information in the main class.
    If "N", 
        indicate that a file will not be printed.


    Your final program submission materials must include:
    - your source code 
    - screenshots of the application executing the application 
    - and the results.
    */
}

