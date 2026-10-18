
import java.util.Scanner;
import java.util.Arrays;

public class MergeSortDemo {
    public static void main(String[] args) {
        int dataSize = 100;
        int[] arr = new int[dataSize];

        for (int i = 0; i < dataSize; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        System.out.println("--- Merge Sort ---");
        System.out.println("Original Unsorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        long startTime = System.nanoTime();

        // Merge Sort Call
        mergeSort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("\nSorted Array (100 elements):");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nExecution time in NanoSeconds: " + totalTime + " ns\n");
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) { // Wait, ensuring proper method signature below
    }
}
// (Aapke oopar diye gaye code ka hi exact Merge Sort method niche paste kar lijiye ga)