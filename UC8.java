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

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

public class UC8_FilterPassengerBogies {

    public static void main(String[] args) {

        // Reusing bogie list (similar to UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(System.out::println);

        // ✅ Stream Filtering Logic
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)   // Condition
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\n=== Filtered Bogies (Capacity > 60) ===");
        filteredBogies.forEach(System.out::println);

        // Check original list unchanged
        System.out.println("\n=== Original List After Filtering (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}  
