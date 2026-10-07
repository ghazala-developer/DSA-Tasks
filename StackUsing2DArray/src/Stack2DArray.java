import java.util.Scanner;

class Stack2DArray {
    static int[][] stack = new int[1][5];
    static int top = -1;

    static void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            stack[0][++top] = value;
            System.out.println(value + " pushed");
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[0][top--] + " popped");
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--)
                System.out.println(stack[0][i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        push(10);
        push(20);
        push(30);

        display();
        pop();
        display();
    }
}
