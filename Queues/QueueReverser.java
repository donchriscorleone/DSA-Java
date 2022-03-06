/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author christopherii
 */
public class QueueReverser {
    public static Queue<Integer> reverse(Queue<Integer> queue, int k) {
        if (k > queue.size() || k <= 0 || queue.isEmpty()) throw new IllegalStateException();
        
        Queue<Integer> result = new ArrayDeque();
        Stack<Integer> stack = new Stack();
        
        for (int i = 0; i < k; i++)
            stack.push(queue.remove());
        
        while (!stack.isEmpty())
            result.add(stack.pop());
        
        while (!queue.isEmpty())
            result.add(queue.remove());
        
        return result;
    }
    
}
