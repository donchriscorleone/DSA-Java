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
        Node node = new Node(item); // Create an instance of Node
        
        // check if list is empty
        if (isEmpty()) {
            this.first = this.last = node; // make the item be the first and last node.
        } else {
            this.last.next = node; // the new node will be pointed by the current last node
            this.last = node; // the last pointer will be pointed to the new node
        }
        
        size++; // increase the size of the list
    }
    
    public void addFirst(int item) {
        Node node = new Node(item); // Create an instance of Node
        
        if (isEmpty()) { // Check if the list is empty
            this.first = last = node; // make the item be the first and last node. 
        } else {
            node.next = this.first; // the next pointer of the new node will be the current head
            this.first = node; // the head node is reassigned to the new node.
        }
        
        size++; // increase the size of the list
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
        
        if (first == last) { // check if the head and tail are the same.
            first = last = null; // "deletes" the node
        } else {
            Node second = this.first.next; // container for the second node in the list
            first.next = null; // the head's next pointer will be null
            this.first = second; // the head will refer to the second node.
        }
        
        size--; // decrease the size of the list
    }
    
    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        
        if (first == last) {
            first = last = null;
        } else {                                //[10 -> 20 -> 30]
            Node previous = getPrevious(last); //        p      L
            last = previous; // the tail/last will refer to the previous node
            last.next = null; // the tail/last's next pointer will be null or deleted 
        }
        
        size--; // decrease the size
    }
    
    public int size() {
        return size;
    }
    
    public int[] toArray() {
        int[] arr = new int[size];
        
        Node pointer = first;
        int index = 0;
        while (pointer != null) {
            arr[index++] = pointer.value;
            pointer = pointer.next;
        }
        
        return arr;
    }
    
    public void reverse() {
        Node previous = first;
        Node current = first.next;
        
        last = first;
        last.next = null;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }
    
    public int getKthFromTheEnd(int k) {
        if (k <= 0 || k > size) throw new IllegalArgumentException();
        
        if (isEmpty()) throw new IllegalStateException();
        
        Node current = first;
        Node next = first;
        for (int i = 0; i < k - 1; i++)
            next = next.next;
        
        while (next != last) {
            current = current.next;
            next = next.next;
        }
        
        return current.value;
    }
    
    public void printMiddle() {
        if (isEmpty()) throw new IllegalStateException();
        
        Node a = first;
        Node b = first;
        
        while (b != last && b.next != null) {
            b = b.next.next;
            a = a.next;
        }
        
        if (b == last) System.out.println(a.value);
        else System.out.println(a.value + " " + a.next.value);
    }
    
    public boolean hasLoop() {
        Node a = first;
        Node b = first;
        
        while (b != null) {
            if (a == b.next) return true;
            
            a = a.next;

            if (b == last) {
                b = a;
            } else {
                b = b.next.next;
            }
        }
        
        return false;
    }
    
    private Node getPrevious(Node node) {
        Node current = first; // get the first or head
        while (current != null) { // loop until the current is null
            if (current.next == node) return current; // return the current node if its next is equal to the given node.
            current = current.next; // current will be pointed to its next node.
        }
        
        return null; // return null if no previous
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
