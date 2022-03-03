/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.Queues;

import java.util.Arrays;

/**
 *
 * @author christopherii
 */
public class ArrayQueue {
    private int[] items = new int[5];
    private int count;
    private int front;
    private int back;
    
    public void enqueue(int item) {
        if (isFull()) throw new IllegalStateException();
        
        items[count++] = item;
        back++;
    }
    
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException();
        
        int item = items[front];
        items[front++] = 0;
        return item;
    }
    
    public int peek() {
        if (isEmpty()) throw new IllegalStateException();
        
        return items[front];
    }
    
    public boolean isFull() {
        return count == items.length;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    @Override
    public String toString() {
        int[] values = Arrays.copyOfRange(items, front, back);
        return Arrays.toString(values);
    }
}
