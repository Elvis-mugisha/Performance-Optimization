package performance;

import java.util.ArrayList;
import java.util.List;

public class PerformanceAppInefficient {
    public static void main(String[] args) {
        System.out.println("am in PerformanceAppInefficient already");
        PerformanceAppInefficient app = new PerformanceAppInefficient();
        app.runApplication();
    }

    public void runApplication() {
        // Example of inefficient code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        // Inefficient sorting
        slowSort(numbers);

        // Memory-intensive task
        memoryIntensiveTask();
    }

    private void slowSort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
    }

    private void memoryIntensiveTask() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            data.add("Data " + i);
        }
        // Simulating heavy memory usage
        System.out.println("Data size: " + data.size());
    }
}
