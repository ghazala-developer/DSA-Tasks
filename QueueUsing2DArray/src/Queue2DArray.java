class Queue2DArray {

    static int[][] queue = new int[1][5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int value) {
        if (rear == 4) {
            System.out.println("Queue Overflow");
        } else {
            queue[0][++rear] = value;
            System.out.println(value + " inserted");
        }
    }

    static void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[0][front] + " deleted");
            front++;
        }
    }

    static void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");

            for (int i = front; i <= rear; i++) {
                System.out.println(queue[0][i]);
            }
        }
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();

        dequeue();

        display();
    }
}

