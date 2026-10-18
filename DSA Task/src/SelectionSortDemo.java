
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int dataSize = 100;
        int[] arr = new int[dataSize];

        for (int i = 0; i < dataSize; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }

        System.out.println("--- Selection Sort ---");
        System.out.println("Original Unsorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        long startTime = System.nanoTime();

        // Selection Sort Logic
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("\nSorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nExecution time in NanoSeconds: " + totalTime + " ns\n");
    }
}