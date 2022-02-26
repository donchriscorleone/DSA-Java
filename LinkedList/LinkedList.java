/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.LinkedList;

import java.util.NoSuchElementException;

/**
 *
 * @author christopherii
 */
public class LinkedList {
    private Node first;
    private Node last;
    private int size;
    
    public void addLast(int item) {
        Node node = new Node(item);
        
        // check if first and last are empty
        if (isEmpty()) {
            this.first = this.last = node;
        } else {
            this.last.next = node;
            this.last = node;
        }
        
        size++;
    }
    
    public void addFirst(int item) {
        Node node = new Node(item);
        
        if (isEmpty()) {
            this.first = last = node;
        } else {
            node.next = this.first;
            this.first = node;
        }
        
        size++;
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
    
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
    
    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        
        if (first == last) {
            first = last = null;
        } else {
            Node second = this.first.next;
            first.next = null;
            this.first = second;
        }
        
        size--;
    }
    
    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        
        if (first == last) {
            first = last = null;
        } else {
            Node previous = getPrevious(last);
            last = previous;
            last.next = null; 
        }
        
        size--;
    }
    
    public int size() {
        return size;
    }
    
    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        
        return null;
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
