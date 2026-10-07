import java.util.Scanner;

public class StackOperations {

    private static final int MAX_SIZE = 5;
    private static final int[] elements = new int[MAX_SIZE];
    private static int pointer = -1;

    private static void add(int value) {
        if (pointer >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow: no space available.");
            return;
        }

        elements[++pointer] = value;
        System.out.println("Value added to stack.");
    }

    private static void remove() {
        if (pointer < 0) {
            System.out.println("Stack Underflow: stack has no elements.");
            return;
        }

        System.out.println("Removed value: " + elements[pointer--]);
    }

    private static void printStack() {
        if (pointer < 0) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack (top to bottom):");

        for (int i = pointer; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }

    private static void showSize() {
        System.out.println("Number of elements: " + (pointer + 1));
    }

    private static void checkEmpty() {
        if (pointer < 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    private static void checkFull() {
        if (pointer == MAX_SIZE - 1) {
            System.out.println("Stack is full.");
        } else {
            System.out.println("Stack is not full.");
        }
    }

    private static void printMenu() {
        System.out.println("\n===== STACK MENU =====");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Size");
        System.out.println("5. Check Empty");
        System.out.println("6. Check Full");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        do {
            printMenu();

            System.out.print("Select an option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter value: ");
                    add(input.nextInt());
                    break;

                case 2:
                    remove();
                    break;

                case 3:
                    printStack();
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

        } while (option != 7);

        input.close();
    }
}
