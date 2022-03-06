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
public class PriorityQueue {
    private int[] array;
    private int count;
    
    public PriorityQueue(int size) {
        this.array = new int[size];
    }
    
    public void add(int item) {
        if (isFull()) throw new IllegalStateException();
                
        if (isEmpty()) {
            array[count++] = item;
            return;
        }
        int i = shiftItemsToInsert(item);
        array[i] = item;
        count++;
    }
    
    public int remove() {
        if (isEmpty()) throw new IllegalStateException();
        
        return array[--count];
    }
    
    public int peek() {
        if (isEmpty()) throw new IllegalStateException();
        
        return array[--count];
    }
    
    public boolean isFull() {
        return count == array.length;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (array[i] > item) {
                array[i + 1] = array[i];
            } else {
                break;
            }
        }
        
        return i + 1;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
}
