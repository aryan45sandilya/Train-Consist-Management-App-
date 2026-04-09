import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Cargo: " + cargo;
    }
}

public class UC12_SafetyCheck {

    public static void main(String[] args) {

        // Create goods bogies list
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Display bogies
        System.out.println("=== Goods Bogies ===");
        bogies.forEach(System.out::println);

        // ✅ Safety Compliance Check using Stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") 
                        || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\n=== Safety Compliance Result ===");
        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}
