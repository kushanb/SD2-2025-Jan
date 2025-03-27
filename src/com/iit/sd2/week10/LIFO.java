package com.iit.sd2.week10;

public class LIFO {
    private String []stack;
    private int first;

    public LIFO(int capacity){
        stack=new String[capacity];
        this.first=-1;
    }
    public void push(String item) {
        if (first == stack.length - 1) { //full
            System.out.println("Stack is full. Element not added.");
            return;
        }
        first++;
        stack[first] = item;
        System.out.println("Element added.");
        System.out.println("Push | First --> " + first);
    }

    public String pop() {
        if (first == -1) { //empty
            System.out.println("Stack is empty.");
            return "";
        }
        String item = stack[first];
        stack[first] = null;
        first--;
        System.out.println("Element removed");
        System.out.println("Pop | First --> " + first);
        return item;

    }

    public void print() {
        if (first == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = first; i >= 0; i--) {
            System.out.print("| " + i + ": " + stack[i] + " |");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LIFO stack = new LIFO(3);
        stack.push("A");
        stack.push("B");
        stack.push("C");
// Testing if queue is full
        stack.push("D"); // This should print "stack is full. Element not added."
// Pop 2 elements
        System.out.println(stack.pop()); // This should print "C"
        System.out.println(stack.pop()); // This should print "B"
// Enqueueing 2 more elements
        stack.push("D");
        stack.push("E");
// Dequeueing all elements
        System.out.println(stack.pop()); // This should print "E"
        System.out.println(stack.pop()); // This should print "D"
        System.out.println(stack.pop()); // This should print "A"
// Testing if queue is empty
        System.out.println(stack.pop()); // This should print “Stack is empty."
    }


}
