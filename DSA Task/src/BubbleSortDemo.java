import java.util.Scanner;
import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int dataSize = 100;
        int[] arr = new int[dataSize];

        for (int i = 0; i < dataSize; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }

        System.out.println("--- Bubble Sort ---");
        System.out.println("Original Unsorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        long startTime = System.nanoTime();

        // Bubble Sort Logic
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("\nSorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nExecution time in NanoSeconds: " + totalTime + " ns\n");
    }
}
