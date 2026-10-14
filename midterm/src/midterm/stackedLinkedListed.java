/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author USER
 */
public class stackedLinkedListed {
    private class Node {
    
int data;
Node next;

Node(int data){
    this.data = data;
    this.next = null;
}
}    

private Node top;

public void push(int data){
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
}
public int pop(){
    if (top == null){
        System.out.println("stack");
        return -1;
    }
    int popdata = top.data;  
    top = top.next;
    return popdata;
}

public int peek(){
    if (top == null){
        System.out.println("Stack is Empty");
    }
    return top.data;
}

public void display(){
    
    if(top == null){
        System.out.println("Stack is empty");
        return;
    }
    Node current = top;
    System.out.println("stack elements");
    
    while(current != null){
        System.out.println("current.data");
        current = current.next;
    }
}

public stackedLinkedListed(){
top = null;
}

public static void main(String[] args){
    
    stackedLinkedListed stack = new  stackedLinkedListed();
    
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    
    
    System.out.println();
    
    stack.display();
    
    System.out.println("Top Element:"+ stack.peek());
    
    System.out.println("Removed:"+ stack.pop());
    
    System.out.println("Top Element:"+ stack.peek());
    
    stack.display();
}
}

    

