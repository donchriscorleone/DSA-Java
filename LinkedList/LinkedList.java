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
    // declare head and tails
    private Node first;
    private Node last;
    
    // create addLast method
    public void addLast(int item) {
        Node node = new Node(item);
        
        // check if first and last are empty
        if (this.first == null) {
            this.first = this.last = node;
        } else {
            this.last.next = node;
            this.last = node;
        }
    }
    
    
    // First, we need to create a Node class    
    public class Node {
        private int value;
        private Node next;
        
        // Write a constructor
        public Node(int value) {
            this.value = value;
        }
    }
}
