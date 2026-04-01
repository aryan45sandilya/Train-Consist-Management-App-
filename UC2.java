import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies (CREATE operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies added successfully...");
        System.out.println("Current Bogies: " + passengerBogies);

        // Remove a bogie (DELETE operation)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair'...");
        System.out.println("Current Bogies: " + passengerBogies);

        // Check existence (READ operation)
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Final state
        System.out.println("\nFinal Passenger Bogies: " + passengerBogies);

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}
