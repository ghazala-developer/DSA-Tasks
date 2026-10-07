import java.util.Scanner;

public class QueueOperations {

    private static final int LIMIT = 5;
    private static final int[] data = new int[LIMIT];

    private static int first = 0;
    private static int last = -1;
    private static int total = 0;

    private static void add(int item) {
        if (total >= LIMIT) {
            System.out.println("Queue is full.");
            return;
        }

        last = (last + 1) % LIMIT;
        data[last] = item;
        total++;

        System.out.println("Item added to queue.");
    }

    private static void remove() {
        if (total == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Removed item: " + data[first]);

        first = (first + 1) % LIMIT;
        total--;
    }

    private static void showQueue() {
        if (total == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < total; i++) {
            int position = (first + i) % LIMIT;
            System.out.print(data[position] + " ");
        }

        System.out.println();
    }

    private static void showSize() {
        System.out.println("Queue contains " + total + " item(s).");
    }

    private static void checkEmpty() {
        System.out.println(total == 0
                ? "Queue is empty."
                : "Queue contains elements.");
    }

    private static void checkFull() {
        System.out.println(total == LIMIT
                ? "Queue is full."
                : "Queue still has space.");
    }

    private static void menu() {
        System.out.println("\n===== QUEUE OPERATIONS =====");
        System.out.println("1. Add (Enqueue)");
        System.out.println("2. Remove (Dequeue)");
        System.out.println("3. Show Queue");
        System.out.println("4. Show Size");
        System.out.println("5. Check Empty");
        System.out.println("6. Check Full");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            menu();
            System.out.print("Select an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    add(input.nextInt());
                    break;

                case 2:
                    remove();
                    break;

                case 3:
                    showQueue();
                    break;

                case 4:
                    showSize();
                    break;

                case 5:
                    checkEmpty();
                    break;

                case 6:
                    checkFull();
                    break;

                case 7:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 7);

        input.close();
    }
}
