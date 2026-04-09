import java.util.*;
import java.util.stream.Collectors;

// Bogie class
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

public class UC13_PerformanceComparison {

    public static void main(String[] args) {

        // Create large dataset for realistic benchmarking
        List<Bogie> bogies = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            int capacity = 40 + random.nextInt(50); // capacity between 40–90
            bogies.add(new Bogie("Sleeper", capacity));
        }

        // =========================
        // ✅ LOOP-BASED FILTERING
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // =========================
        // ✅ STREAM-BASED FILTERING
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // =========================
        // RESULTS
        // =========================
        System.out.println("=== Performance Comparison ===");

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // Verify both results are same
        if (loopResult.size() == streamResult.size()) {
            System.out.println("\n✔ Results MATCH");
        } else {
            System.out.println("\n❌ Results DO NOT MATCH");
        }
    }
}
