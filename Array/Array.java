/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.Array;

/**
 *
 * @author christopherii
 */
public class Array {
    private int[] items;
    private int count = 0; // keep track the current items;
    
    public Array(int length) {
        this.items = new int[length];
    }
    
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
    
    public void add(int value) {
        // Check if array is full
        if (items.length == count) {
            // Create a container array
            int[] newArray = new int[count * 2];
            // Copy the existing array to the newArray
            for (int i = 0; i < count; i++)
                newArray[i] = items[i];
            
            items = newArray; // transfer the newArray to the items
        }
        
        items[count++] = value;
    }
    
    public void removeAt(int index) {
        if (index < 0 || index > count) throw new IllegalArgumentException();
        
        // shift the items
        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];
        
        count--; // decrement the count since we just remove an item
    }
    
    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item) return i;
        
        return -1; // default value if the item is not found
    }
    
    public int size() {
        return count;
    }
}
