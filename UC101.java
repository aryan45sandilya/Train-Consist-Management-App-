import java.util.*;

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

    public String getType() {
        return type;
    }
}

public class UC10_TotalSeats {

    public static void main(String[] args) {

        // Reusing bogie list (UC7/UC8/UC9)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        // Display bogies
        System.out.println("=== Bogie List ===");
        bogies.forEach(b ->
            System.out.println(b.getType() + " -> " + b.getCapacity())
        );

        // ✅ Stream Aggregation Logic
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // Extract capacity
                .reduce(0, Integer::sum);      // Sum all values

        // Display total
        System.out.println("\n=== Total Seating Capacity ===");
        System.out.println("Total Seats in Train: " + totalSeats);

        // Original list remains unchanged
        System.out.println("\n=== Original List After Aggregation (Unchanged) ===");
        bogies.forEach(b ->
            System.out.println(b.getType() + " -> " + b.getCapacity())
        );
    }
}
