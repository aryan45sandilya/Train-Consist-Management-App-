import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for clean output
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies (name + capacity)
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Optional: Descending order
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // System ready message
        System.out.println("\nSystem ready for operations...");
    }
}
