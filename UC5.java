import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (insertion order preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Display final formation
        System.out.println("Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        // Show total bogies
        System.out.println("\nTotal Bogies: " + trainFormation.size());

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}
