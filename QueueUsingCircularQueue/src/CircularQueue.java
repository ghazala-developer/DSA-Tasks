class CircularQueue {

    static int[] queue = new int[5];

    static int front = -1;
    static int rear = -1;

    static void enqueue(int value) {

        // Check if queue is full
        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue Overflow");
            return;
        }

        // First element
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;

        System.out.println(value + " inserted");
    }

    static void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(queue[front] + " deleted");

        // Only one element was present
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    static void display() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");

        int i = front;

        while (true) {
            System.out.println(queue[i]);

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();

        dequeue();
        dequeue();

        enqueue(50);
        enqueue(60);

        display();
    }
}

