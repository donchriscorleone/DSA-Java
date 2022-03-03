/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

import datastructuresandalgorithms.Stacks.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author christopherii
 */
public class DataStructuresAndAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // first we declare a queue class
        Queue<Integer> queue = new ArrayDeque<>();
        
        // add items to our queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        // print the initial items
        System.out.println(queue);
        
        // use the reverse method
        reverse(queue);
        
        // remove the first item in the queue
        System.out.println("First item " + queue.remove());
        // print again the queue
        System.out.println(queue);
    }
    
    // create the reverse method
    public static void reverse(Queue<Integer> queue) {
        // We will use stacks for reversing
        Stack<Integer> stack = new Stack<>();
        
        // iterate the queue
        while (!queue.isEmpty()) // while the items in queue are not empty
            stack.push(queue.remove());
        
        // iterate the stack
        while (!stack.isEmpty())
            queue.add(stack.pop());
        
        // print the queue
        System.out.println(queue);
    }
        
}
