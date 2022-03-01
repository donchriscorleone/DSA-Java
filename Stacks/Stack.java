/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.Stacks;

import java.util.Arrays;

/**
 *
 * @author christopherii
 */
public class Stack {
    private int[] items = new int[5];
    private int count;    
    // [10, 20, 30]
    //  c
    
    public void push(int item) {
        if (isFull()) {
            int[] newItems = new int[count * 2]; // double the length
            for (int i = 0; i < count; i++) // iterate over the current items
                newItems[i] = items[i]; // transfer the current items to the new items container
            
            items = newItems; // reassigned the new items to the items property
        }
        
        items[count++] = item; // add the item to the items
    }
    
    public int pop() {
        if (isEmpty()) throw new IllegalStateException();
        
        return items[--count];
    }
    
    public int peek() {
        if (isEmpty()) throw new IllegalStateException();
        
        return items[count - 1];
    }
    
    private boolean isFull() {
        return count == items.length;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    @Override
    public String toString() {
        int[] values = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(values);
    }
}
