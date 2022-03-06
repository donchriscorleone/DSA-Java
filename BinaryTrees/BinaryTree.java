/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.BinaryTrees;

/**
 *
 * @author christopherii
 */
public class BinaryTree {
    private Node root;
    
    public void insert(int value) {
       if (isEmpty()) {
           this.root = new Node(value);
           return;
       }
       
       Node current = root;
       while (true) {
           if (value < current.value) {
               if (current.left == null) {
                   current.left = new Node(value);
                   break;
               }
               current = current.left;
           }
           else {
               if (current.right == null) {
                   current.right = new Node(value);
                   break;
               }
               current = current.right;
           }
       }
    }
    
    private void insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return;
        }
        
        if (value < node.value)
           this.insert(value, node.left);
       else 
           this.insert(value, node.right);
    }
    
    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (value < current.value)
                current = current.left;
            else if (value > current.value)
                current = current.right;
            else 
                return true;
        }
        
        return false;
    }
    
    private boolean find(int value, Node node) {
//        while (node != null)
return false;
    }
    
    public boolean isEmpty() {
        return root == null;
    }
    
    private class Node {
        private int value;
        private Node left;
        private Node right;
        
        public Node(int value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return "Node = " + this.value;
        }
    }
}
