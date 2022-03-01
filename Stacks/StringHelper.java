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
        Stack<Character> stack = new Stack(); // Initialize Stack class
        for (char ch: text.toCharArray()) // loop the text
            stack.push(ch); // add the current character from the iteration
        
        StringBuilder result = new StringBuilder(); // initialize a StringBuilder.
        while (!stack.isEmpty()) // iterate the stack until its empty
            result.append(stack.pop()); // pop out the top of the stack into the string builder
        
        return result.toString(); // return the value of the string builder
    }
}
