import java.util.*;
import java.util.stream.Collectors;

// Base class
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Capacity: " + capacity;
    }
}

public class UC9_GroupBogies {

    public static void main(String[] args) {

        // Reusing bogie list (from UC7/UC8)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(b -> 
            System.out.println(b.getType() + " -> " + b.getCapacity())
        );

        // ✅ Grouping using Stream API
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Display grouped result
        System.out.println("\n=== Grouped Bogies by Type ===");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("   " + b);
            }
        }

        // Original list unchanged check
        System.out.println("\n=== Original List After Grouping (Unchanged) ===");
        bogies.forEach(b -> 
            System.out.println(b.getType() + " -> " + b.getCapacity())
        );
    }
}
