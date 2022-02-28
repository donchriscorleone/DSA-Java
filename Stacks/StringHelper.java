/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.Stacks;
import java.util.Stack;

/**
 *
 * @author christopherii
 */
public class StringHelper {
    public static String reverse(String text) {
        Stack<Character> stack = new Stack();
        for (char ch: text.toCharArray())
            stack.push(ch);
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty())
            result.append(stack.pop());
        
        return result.toString();
    }
}
