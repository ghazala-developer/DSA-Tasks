import java.util.Scanner;
class StackCircularQueue {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;
    static int size = 0;

    static void push(int value) {
        if (size == queue.length) {
            System.out.println("Stack Overflow");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;

        System.out.println(value + " pushed");
    }

    static void pop() {
        if (size == 0) {
            System.out.println("Stack Underflow");
            return;
        }

        // Move front to the latest element
        int lastIndex = (front + size - 1) % queue.length;
        System.out.println(queue[lastIndex] + " popped");

        rear = (lastIndex - 1 + queue.length) % queue.length;
        size--;
    }

    static void display() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = size - 1; i >= 0; i--) {
            int index = (front + i) % queue.length;
            System.out.println(queue[index]);
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        display();
        pop();
        display();
    }
}
