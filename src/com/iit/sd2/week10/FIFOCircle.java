package com.iit.sd2.week10;

public class FIFOCircle {
    private String[] queue;
    private int front;
    private int rear;
    private int numElements = 0;

    public FIFOCircle(int capacity) {
        super();
        this.queue = new String[capacity];
    }

    public void enqueue(String item) {
        if (numElements == queue.length) {
            System.out.println("The que is full. " +
                    "Item not added...");
            return;
        }
        queue[rear] = item;
        rear = (++rear) % queue.length;
        numElements++;
        System.out.println("Enqueue Front: " + front + "| Rear: " + rear);
    }

    public String dequeue() {
        if(numElements == 0) {
            System.out.println("Queue is empty...");
            return "";
        }
        String item = queue[front];
        front = ++front % queue.length;
        numElements--;
        System.out.println("Dequeue Front: "
                + front + "| Rear: " + rear);
        return item;

    }

    public void print() {
        if (numElements == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i != rear; i = (i + 1) % queue.length) {
            System.out.print("| " + i + ": " + queue[i] + " |");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FIFOCircle queue = new FIFOCircle(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        // Testing if queue is full
        queue.enqueue("D"); // This should print "Queue is full. Element not added."
        // Dequeueing 2 elements
        System.out.println(queue.dequeue()); // This should print "A"
        System.out.println(queue.dequeue()); // This should print "B"
        // Enqueueing 2 more elements
        queue.enqueue("D");
        queue.enqueue("E");
        // Dequeueing all elements
        System.out.println(queue.dequeue()); // This should print "C"
        System.out.println(queue.dequeue()); // This should print "D"
        System.out.println(queue.dequeue()); // This should print "E"
        // Testing if queue is empty
        System.out.println(queue.dequeue()); // This should print "Queue is empty."
    }

}
