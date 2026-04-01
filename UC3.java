import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display results
        System.out.println("Bogie IDs added (duplicates attempted)...");
        System.out.println("Unique Bogie IDs: " + bogieIds);

        // Show total unique count
        System.out.println("Total Unique Bogies: " + bogieIds.size());

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}
