/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

import datastructuresandalgorithms.Queues.*;
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
        PriorityQueue queue = new PriorityQueue(4);
        queue.add(10);
        queue.add(20);
   
        System.out.println(queue);
        System.out.println(queue.peek());
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
