import java.util.ArrayList;
import java.util.Scanner;

public class CriticalThinkingFinal{


    //create a method with an array in it for car make
    public static ArrayList<String> carMake = new ArrayList<>();
    public static ArrayList<String> carModel = new ArrayList<>();
    public static ArrayList<String> carColor = new ArrayList<>();
    public static ArrayList<Integer> carYear = new ArrayList<>();
    public static ArrayList<Integer> carMileage = new ArrayList<>();

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            carMake.add("Toyota");
            carModel.add("Camry");
            carYear.add(2010);
            carColor.add("Black");
            carMileage.add(100000);

            carMake.add("Ford");
            carModel.add("F150");
            carYear.add(2015);
            carColor.add("Red");
            carMileage.add(50000);

            carMake.add("Chevy");
            carModel.add("Silverado");
            carYear.add(2018);
            carColor.add("Blue");
            carMileage.add(30000);

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
            System.out.println("*               2. Add a vehicle                                             *");
            System.out.println("*               3. Remove a vehicle                                          *");
            System.out.println("*               4. Update vehicle attributes                                 *");
            System.out.println("*               5. Exit the program                                          *");
            System.out.println("*                                                                            *");  
            System.out.println("*                                                                            *");  
            System.out.println("******************************************************************************");
            int userMenuSelection = scanner.nextInt();

            switch(userMenuSelection){
                case 1:
                    printAllVehicles();
                    System.out.println("\n\n");
                    break;

                case 2:
                    System.out.println("\n\n");
                    addVehicle();
                    System.out.println("\n\n");
                    break;

                case 3:
                    System.out.println("\n\n");
                    removeVehicle();
                    System.out.println("\n\n");
                    break;

                case 4:
                    System.out.println("\n\n");
                    updateVehicle();
                    System.out.println("\n\n");
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("\n\n");
                    System.out.println("Invalid entry. Please try again.");
                    System.out.println("\n\n");
                    break;
            }
        }
        if(exit == true){
            System.out.println("Goodbye!");
        }
    }

    //create a method to list all vehicles
    public static void printAllVehicles(){
        System.out.println("\n\n");
        System.out.println("\n\nCurrent Inventory: ");

        for(int i = 0; i < carMake.size(); i++){
            System.out.println( "Vehicle " + (i + 1) + ": "+ carMake.get(i) + " " + carModel.get(i) + " " + carYear.get(i) + " " + carColor.get(i) + " " +  carMileage.get(i) + " miles.");
        }
    }

    //create a method to add a vehicle
    public static void addVehicle(){
        System.out.println("\n\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the make of the vehicle   : ");
        String addMake = scanner.nextLine();
        carMake.add(addMake);

        System.out.print("Please enter the model of the vehicle  : ");
        String addModel = scanner.nextLine();
        carModel.add(addModel);

        System.out.print("Please enter the year of the vehicle   : ");
        int addYear = scanner.nextInt();
        carYear.add(addYear);

        System.out.print("Please enter the color of the vehicle  : ");
        String addColor = scanner.nextLine();
        addColor = scanner.nextLine();
        carColor.add(addColor);

        System.out.print("Please enter the mileage of the vehicle: ");
        int addMileage = scanner.nextInt();
        carMileage.add(addMileage);
    }



    //create a method to remove a vehicle
    public static void removeVehicle(){
        System.out.println("\n\n");

        Scanner scanner = new Scanner(System.in);
        printAllVehicles();

        System.out.print("Please enter the number of the vehicle you would like to remove: ");
        int userRemove = scanner.nextInt();
        userRemove = userRemove - 1;
        carMake.remove(userRemove);
        carModel.remove(userRemove);
        carYear.remove(userRemove);
        carColor.remove(userRemove);
        carMileage.remove(userRemove);
        System.out.println("Vehicle " + (userRemove + 1) + " has been removed.");
    }



    //create a method to update a vehicle
    public static void updateVehicle(){
        System.out.println("\n\n");
        Scanner scanner = new Scanner(System.in);
        printAllVehicles();

        System.out.println("Please enter the number of the vehicle you would like to update: ");
        int updateVehicle = scanner.nextInt();
        updateVehicle = updateVehicle - 1;

        System.out.println("Please enter the attribute you would like to update: ");
        System.out.println("       Make");
        System.out.println("       Model");
        System.out.println("       Year");
        System.out.println("       Color");
        System.out.println("       Mileage");
        String userUpdate = scanner.nextLine();
        userUpdate = scanner.nextLine();
        userUpdate.toLowerCase();

        switch(userUpdate){
            case "make":
                System.out.println("Please enter the make of the vehicle: ");
                String make = scanner.nextLine();
                carMake.set(updateVehicle, make);
                break;
            case "model":
                System.out.println("Please enter the model of the vehicle: ");
                String model = scanner.nextLine();
                carModel.set(updateVehicle, model);
                break;
            case "year":
                System.out.println("Please enter the year of the vehicle: ");
                int year = scanner.nextInt();
                carYear.set(updateVehicle, year);
                break;
            case "color":
                System.out.println("Please enter the color of the vehicle: ");
                String color = scanner.nextLine();
                carColor.set(updateVehicle, color);
                break;
            case "mileage":
                System.out.println("Please enter the mileage of the vehicle: ");
                int mileage = scanner.nextInt();
                carMileage.set(updateVehicle, mileage);
                break;

            default:
                System.out.println("Invalid entry. Please try again.");
                break;
        }


        /* 

        if the switch statement doesnt work we can make them do the whole thing

        System.out.println("Please enter the make of the vehicle: ");
        String make = scanner.nextLine();
        carMake.set(userUpdate, make);

        System.out.println("Please enter the model of the vehicle: ");
        String model = scanner.nextLine();
        carModel.set(userUpdate, model);

        System.out.println("Please enter the year of the vehicle: ");
        int year = scanner.nextInt();
        carYear.set(userUpdate, year);

        System.out.println("Please enter the color of the vehicle: ");
        String color = scanner.nextLine();
        carColor.set(userUpdate, color);

        System.out.println("Please enter the mileage of the vehicle: ");
        int mileage = scanner.nextInt();
        carMileage.set(userUpdate, mileage);
        */
    }



}