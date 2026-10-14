/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author USER
 */
public class stackArray {
     private int[] stack;
    private int top;
    private int capacity;

    public stackArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        top++;
        stack[top] = value;
        System.out.println("Pushed at " + top + ": " + value);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return stack[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        int value = stack[top];
        top--;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (Top to Bottom):");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        stackArray stack = new stackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();

        stack.display();

        System.out.println();
        System.out.println("Top element: " + stack.peek());

        System.out.println();
        System.out.println("Removed: " + stack.pop());

        System.out.println();
        stack.display();
    }
}

    

