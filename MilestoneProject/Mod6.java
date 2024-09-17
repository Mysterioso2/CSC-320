package MilestoneProject;
import java.util.Scanner;

public class Mod6.PortfolioMilestone {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Automobile auto = new Automobile();
        //auto.addVehicle();
        //auto.listOneVehicle();
        //auto.allVehicles();
        //auto.RemoveVehicle();
        //auto.UpdateVehicle();


        //Create an automobile class that will be used by a dealership as a vehicle inventory program.
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
                    listOneVehicle();
                    break;
                case 3:
                    addVehicle();
                    break;
                case 4:
                    RemoveVehicle();
                    break;
                case 5:
                    UpdateVehicle();
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

    Create an automobile class that will be used by a dealership as a vehicle inventory program. 
    The class should include private variables for make, model, color, year, and mileage.
             
    //private string make
    
}


    //default constructor
    //The class should include private variables for make, model, color, year, and mileage.

    public Automobile(String make, String model, String color, int year, int mileage){
        make = "";
        model = "";
        color = "";
        year = 0;
        mileage = 0;

        private String[] make = {"Ford", "Chevy", "Toyota", "Honda", "Nissan", "Dodge", "Jeep", "Subaru", "BMW", "Mercedes", "Audi", "Volkswagen", "Kia")}

        //private string model
        private String[] model = {"F150", "Silverado", "Tacoma", "Civic", "Altima", "Challenger", "Wrangler", "Outback", "X5", "E-Class", "A4", "Passat", "Soul"}

        //private string color
        private String[] color = {"Red", "Blue", "Yellow", "Black", "White", "Silver", "Gunmetal", "Orange", "Purple", "Tan"}
        
        //private int year
        private int[] year = {2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024}

        //private int mileage
        private int[] mileage = {0, 5000, 10000, 15000, 20000, 25000, 50000, 60000, 70000, 80000, 90000, 100000, 110000, 120000, 130000, 140000, 150000, 160000, 170000, 180000, 190000, 200000}

    }
    
    //parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    //add a new vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage){
        for (int i = 0; i < make.length; i++){
            System.out.print(make[i] + ", ");
        }
        System.out.print("\nWhat is the make of the new vehicle? Please enter a make from the list above: ");
        String userMake = scanner.nextLine();
        make = userMake;

        for (int i = 0; i < model.length; i++){
            System.out.print(model[i] + ", ");
        }
        System.out.print("\nWhat is the model of the new vehicle? Please enter a model from the list above: ");
        String userModel = scanner.nextLine();
        model = userModel;

        for (int i = 0; i < color.length; i++){
            System.out.print(color[i] + ", ");
        }
        System.out.print("\nWhat is the color of the new vehicle?");
        String userColor = scanner.nextLine();
        color = userColor;

        for (int i = 0; i < year.length; i++){
            System.out.print(year[i] + ", ");
        }
        System.out.print("\nWhat is the year of the new vehicle?");
        int userYear = scanner.nextInt();
        year = userYear;

        for (int i = 0; i < mileage.length; i++){
            System.out.print(mileage[i] + ", ");
        }
        System.out.print("\nWhat is the mileage of the new vehicle?");
        int userMileage = scanner.nextInt();
        mileage = userMileage;

        //print out the details of the new vehicle so they can see it 
        for(int i = make.length - 1){
        System.out.print("Vehicle " + i + ": " + year[i] + make[i] + model[i] + color[i] + mileage[i]);
        }
        return System.out.println("The new vehicle has been added.");
    }


    public string[] listOneVehicle(){
    System.out.print("Which vehicle would you like to list? Please enter a number (vehicle 1 - " + make.length + ")")
    int userVehicle = scanner.nextInt();
    for (int i = userVehicle){
        return year[i] + make[i] + model[i] + color[i] + mileage[i]
        }
    }

    public string[] allVehicles(){
    for (int i = 0; i < make.length; i++){
        System.out.print("Vehicle " + i + ": ");
        System.out.print(year[i] + make[i] + model[i] + color[i] + mileage[i]);
        //should i return or print to console?
        }
    }
        
    //remove vehicle +++ done i think +++
    public static RemoveVehicle(){
                System.out.println(allVehicles());

                System.out.print("Which vehicle would you like to remove? Please enter a number (vehicle 1 - " + make.length + ")");
                String userVehicleSelection = scanner.nextInt();
                int i = userVehicleSelection;
                make[i] = "";
                model[i] = "";
                color[i] = "";
                year[i] = 0;
                mileage[i] = 0;
                return System.out.println("Vehicle " + i + " has been removed.");
    }

    //update vehicle +++ done i think +++
    public String UpdateVehicle(){
                //System.out.println("Which vehicle would you like to update? Please enter a number (vehicle 1 - " + make.length + ")");
                //System.out.println(allVehicles());
                String userVehicleSelection = scanner.nextInt();
                int i = userVehicleSelection;
                
                //System.out.print("what would you like to update? (make, model, color, year, mileage)");
                String userUpdate = scanner.nextLine().toLowerCase();
                
                switch userUpdate{
                    case "make":
                        //update make
                        System.out.println("What would you like to update the make to?");
                        userMake = scanner.nextLine();
                        make[i] = userMake;
                        break;

                    case "model":
                        //update model
                        System.out.println("What would you like to update the model to?");
                        userModel = scanner.nextLine();
                        model[i] = userModel;
                        break;

                    case "color":
                        //update color
                        System.out.println("What would you like to update the color to?");
                        userColor = scanner.nextLine();
                        color[i] = userColor;
                        break;

                    case "year":
                        //update year
                        System.out.println("What would you like to update the year to?");
                        userYear = scanner.nextInt();
                        year[i] = userYear;
                        break;

                    case "mileage":
                        //update mileage
                        System.out.println("What would you like to update the mileage to?");
                        userMileage = scanner.nextInt();
                        mileage[i] = userMileage;
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
