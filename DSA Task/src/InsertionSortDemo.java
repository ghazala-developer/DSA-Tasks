import java.util.Scanner;
import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int dataSize = 100;
        int[] arr = new int[dataSize];

        for (int i = 0; i < dataSize; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }

        System.out.println("--- Insertion Sort ---");
        System.out.println("Original Unsorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        long startTime = System.nanoTime();

        // Insertion Sort Logic
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("\nSorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nExecution time in NanoSeconds: " + totalTime + " ns\n");
    }
}
