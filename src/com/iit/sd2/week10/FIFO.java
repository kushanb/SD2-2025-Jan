package com.iit.sd2.week10;

import java.util.Arrays;

public class FIFO {
    private String[] queue;
    private int numElements = 0;

    public FIFO(int capacity) {
        super();
        this.queue = new String[capacity];
    }

    /**
     * Add items to the queue
     *
     * @param item String value holding the item to store
     */
    public void enqueue(String item) {
        if(numElements == this.queue.length) {
            System.out.println("The queue is full!");
        }

        queue[numElements] = item;
        numElements++;
    }

    /**
     * Method to get the first item from the queue
     *
     * @return the first item
     */
    public String dequeue() {
        if(numElements == 0) {
            System.out.println("The queue is empty");
            return "";
        }

        String firstItem = this.queue[0];
        numElements--;
        for(int i = 0; i < queue.length - 1; i++) {
            // ["Hello", "World", "!", null, null]
            // ["World", "!", null, null, null]
            queue[i] = queue[i+1];
        }
        return firstItem;
    }

    public String[] getQueue() {
        return queue;
    }

    public static void main(String[] args) {
        FIFO queue1 = new FIFO(5);
        System.out.println("Before adding --> " + Arrays.toString(queue1.getQueue()));
        queue1.enqueue("Hello");
        queue1.enqueue("World");
        queue1.enqueue("!");
        System.out.println("After Adding --> " + Arrays.toString(queue1.getQueue()));
        System.out.println(queue1.dequeue());
        System.out.println("After removing 1 --> " + Arrays.toString(queue1.getQueue()));
        System.out.println(queue1.dequeue());
        System.out.println("After removing 2 --> " + Arrays.toString(queue1.getQueue()));
//        queue1.enqueue("Test 1");
//        System.out.println("After Adding --> " + Arrays.toString(queue1.getQueue()));
//        queue1.enqueue("Test 2");
//        System.out.println("After Adding --> " + Arrays.toString(queue1.getQueue()));
        System.out.println(queue1.dequeue());
        System.out.println("After removing 3 --> " + Arrays.toString(queue1.getQueue()));
        queue1.dequeue();
        System.out.println("After removing 4 --> " + Arrays.toString(queue1.getQueue()));
        queue1.dequeue();
        System.out.println("After removing 5 --> " + Arrays.toString(queue1.getQueue()));
        queue1.dequeue();

    }
}
