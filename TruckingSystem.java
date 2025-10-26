// Import the Scanner class to allow user input from the keyboard
import java.util.Scanner;

// Define the main class named TruckingSystem
public class TruckingSystem {
    // The main method is the entry point of the program
    public static void main(String []args) {
        // Create a Scanner object inside a try-with-resources block to safely handle input
        try (Scanner input = new Scanner(System.in)) {
            
            // Print a line separator for visual formatting
            System.out.println("---------------------------------");
            // Print the program title
            System.out.println("TRACKING SYSTEM MANAGEMENT");
            // Print another line separator
            System.out.println("---------------------------------");
            
            // Ask the user to enter the Truck ID
            System.out.println("Truck ID");
            // Store the user's input (Truck ID) as a string
            String truckID = input.nextLine();
            
            // Ask the user to enter the Driver Name
            System.out.println("Driver Name");
            // Store the user's input (Driver Name) as a string
            String driverName = input.nextLine();
            
            // Ask the user to enter the Destination
            System.out.println("Destination");
            // Store the user's input (Destination) as a string
            String destination = input.nextLine();
            
            // Ask the user to enter the Cargo Weight
            System.out.println("Cargo Weight");
            // Store the user's input (Cargo Weight) as a double value
            double cargowWeight = input.nextDouble();
            
            // Compute the estimated fuel needed based on the cargo weight
            // The formula assumes 2.5 liters of fuel per ton of cargo
            double fuelNeeded = cargowWeight * 2.5;
            
            // Print the start of the trip summary section
            System.out.println("TRIP SUMMARY");
            // Display the entered Truck ID
            System.out.println("TRUCK ID: " + truckID);
            // Display the entered Driver Name
            System.out.println("DRIVER NAME: " + driverName);
            // Display the entered Destination
            System.out.println("DESTINATION: " + destination);
            // Display the entered Cargo Weight followed by the unit "Tons"
            System.out.println("Cargo Weight: " + cargowWeight + " Tons");
            // Display the calculated estimated fuel needed followed by "Liters"
            System.out.println("Estimated Fuel Needed: " + fuelNeeded + " Liters");
            
            // Print the final status message indicating the truck is ready to go
            System.out.println("Status: Trucking is now ready for departure");
        }
        // End of try block - the Scanner automatically closes here
    }
    // End of main method
}
// End of TruckingSystem class
