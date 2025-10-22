import java.util.Scanner;

public class TruckingSystem {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("TRACKING SYSTEM MANAGEMENT");
        System.out.println("---------------------------------");

        System.out.println("Truck ID");
        String truckID= input.nextLine();

        System.out.println("Driver Name");
        String driverName = input.nextLine();

        System.out.println("Destination");
        String destination = input.nextLine();

        System.out.println("Cargo Weight");
        double cargowWeight = input.nextDouble();

        double fuelNeeded = cargowWeight * 2.5;

        System.out.println("TRIP SUMMARY");
        System.out.println("TRUCK ID: " + truckID);
        System.out.println("DRIVER NAME: "+ driverName);
        System.out.println("DESTINATION: "+ destination);
        System.out.println("Cargo Weight: "+ cargowWeight +"Tons");
        System.out.println("Estimated Fuel Needed: "+ fuelNeeded +"Liters");

        System.out.println("Status: Trucking is now ready for departure");

        input.close();
    }
}