/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.Queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author christopherii
 */
public class StackQueue {
    private Stack<Integer> front = new Stack();
    private Stack<Integer> rear = new Stack();
    
    public void enqueue(int item) {
        front.push(item);
    }
    
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException();

        moveFrontToRear();
                
        return rear.pop();
    }
    
    public int peek() {
        if (isEmpty()) throw new IllegalStateException();

        moveFrontToRear();
                
        return rear.peek();
    }
    
    public boolean isEmpty() {
        return front.isEmpty() && rear.isEmpty();
    }
    
    private void moveFrontToRear() {
        if (rear.isEmpty()) {
            while (!front.isEmpty())
                rear.push(front.pop());
        }
    }
    
    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList();
        Stack<Integer> head = front;
        Stack<Integer> tail = rear;
        
        while (!tail.isEmpty())
            list.add(tail.pop());
        
        while (!head.isEmpty())
            list.add(head.pop());
        
        return list.toString();
    }
}
