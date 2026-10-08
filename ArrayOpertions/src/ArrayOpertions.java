import java.util.Scanner;
public class ArrayOpertions {

    private static final int MAX = 100;
    private static final int[] numbers = new int[MAX];
    private static int count = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        do {
            showMenu();
            System.out.print("Choose an option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    addElement(input);
                    break;

                case 2:
                    insertElement(input);
                    break;

                case 3:
                    addMultiple(input);
                    break;

                case 4:
                    removeLast();
                    break;

                case 5:
                    removeAt(input);
                    break;

                case 6:
                    showElements();
                    break;

                case 7:
                    findElement(input);
                    break;

                case 8:
                    readElement(input);
                    break;

                case 9:
                    changeElement(input);
                    break;

                case 10:
                    System.out.println("Number of elements: " + count);
                    break;

                case 11:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Please enter a valid option.");
            }

        } while (option != 11);

        input.close();
    }

    private static void showMenu() {
        System.out.println("\n===== ARRAY OPERATIONS =====");
        System.out.println("1. Add value");
        System.out.println("2. Insert at index");
        System.out.println("3. Fill array");
        System.out.println("4. Delete last element");
        System.out.println("5. Delete by index");
        System.out.println("6. Display array");
        System.out.println("7. Search value");
        System.out.println("8. Get value");
        System.out.println("9. Update value");
        System.out.println("10. Show size");
        System.out.println("11. Exit");
    }

    private static void addElement(Scanner input) {
        if (count >= MAX) {
            System.out.println("No space available.");
            return;
        }

        System.out.print("Enter a number: ");
        numbers[count] = input.nextInt();
        count++;

        System.out.println("Number added.");
    }

    private static void insertElement(Scanner input) {
        if (count == MAX) {
            System.out.println("Array capacity reached.");
            return;
        }

        System.out.print("Enter index: ");
        int position = input.nextInt();

        if (position < 0 || position > count) {
            System.out.println("Index is not valid.");
            return;
        }

        System.out.print("Enter value: ");
        int value = input.nextInt();

        for (int i = count; i > position; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[position] = value;
        count++;

        System.out.println("Value inserted.");
    }

    private static void addMultiple(Scanner input) {
        System.out.print("How many values? ");
        int total = input.nextInt();

        if (total < 0 || total > MAX - count) {
            System.out.println("Cannot add this number of values.");
            return;
        }

        for (int i = 0; i < total; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[count++] = input.nextInt();
        }

        System.out.println("Values added successfully.");
    }

    private static void removeLast() {
        if (count == 0) {
            System.out.println("There are no elements.");
            return;
        }

        System.out.println("Removed: " + numbers[count - 1]);
        count--;
    }

    private static void removeAt(Scanner input) {
        if (count == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Enter index to remove: ");
        int position = input.nextInt();

        if (position < 0 || position >= count) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.println("Removed: " + numbers[position]);

        for (int i = position; i < count - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        count--;
        System.out.println("Element removed.");
    }

    private static void showElements() {
        if (count == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array: ");

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }

    private static void findElement(Scanner input) {
        System.out.print("Enter value to find: ");
        int target = input.nextInt();

        for (int i = 0; i < count; i++) {
            if (numbers[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Value not found.");
    }

    private static void readElement(Scanner input) {
        System.out.print("Enter index: ");
        int position = input.nextInt();

        if (position >= 0 && position < count) {
            System.out.println("Value = " + numbers[position]);
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void changeElement(Scanner input) {
        System.out.print("Enter index: ");
        int position = input.nextInt();

        if (position < 0 || position >= count) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter replacement value: ");
        numbers[position] = input.nextInt();

        System.out.println("Value changed successfully.");
    }
}