/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.LinkedList;

/**
 *
 * @author christopherii
 */
public class LinkedList {
    private Node first;
    private Node last;
    
    public void addLast(int item) {
        Node node = new Node(item);
        
        // check if first and last are empty
        if (isEmpty()) {
            this.first = this.last = node;
        } else {
            this.last.next = node;
            this.last = node;
        }
    }
    
    public void addFirst(int item) {
        Node node = new Node(item);
        
        if (isEmpty()) {
            this.first = last = node;
        } else {
            node.next = this.first;
            this.first = node;
        }
    }
    
    public int indexOf(int item) {
        Node pointer = this.first;
        int index = 0;
        while (pointer != null) {
            if (pointer.value == item) return index;
            
            pointer = pointer.next;
            index++;
        }
        
        return -1;
    }
    
    private boolean isEmpty() {
        return this.first == null;
    }
    
    public class Node {
        private int value;
        private Node next;
        
        // Write a constructor
        public Node(int value) {
            this.value = value;
        }
    }
}
