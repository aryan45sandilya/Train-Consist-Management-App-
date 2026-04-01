import java.util.LinkedList;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies (initial sequence)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry");
        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println("Train Consist: " + trainConsist);

        // Remove first and last bogies
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println("Final Train Consist: " + trainConsist);

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}
