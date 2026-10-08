import java.util.Scanner;
class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node top = null;

    static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data + " popped");
            top = top.next;
        }
    }

    static void display() {
        Node temp = top;

        if (temp == null) {
            System.out.println("Stack is empty");
            return;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
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

