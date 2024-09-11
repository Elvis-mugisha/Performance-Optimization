package performance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerformanceAppOptimized {
    public static void main(String[] args) {
        PerformanceAppOptimized app = new PerformanceAppOptimized();
        app.runApplication();
    }

    public void runApplication() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        // Optimized sorting using Collections
        optimizedSort(numbers);

        // Memory optimization
        optimizedMemoryTask();
    }

    private void optimizedSort(List<Integer> numbers) {
        Collections.sort(numbers); // More efficient sorting algorithm
    }

    private void optimizedMemoryTask() {
        List<String> data = new ArrayList<>(100000); // Pre-allocate size
        for (int i = 0; i < 100000; i++) {
            data.add("Data " + i);
        }
        System.out.println("Data size: " + data.size());
    }
}

