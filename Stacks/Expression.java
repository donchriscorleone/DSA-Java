/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author christopherii
 */
public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('[', '<', '{', '(');
    private final List<Character> rightBrackets = Arrays.asList(']', '>', '}', ')');
    
    public boolean isBalance(String text) {
        Stack<Character> stack = new Stack(); // Initialize a stack
        
        for (char ch: text.toCharArray()) { // iterate over the text 
            if (isLeft(ch)) // if current character is left,
                stack.push(ch); // store it in the stack
            
            if (isRight(ch)) { // if its right
                if (stack.empty()) return false; // an edge case
                
                char left = stack.pop(); // get the current top of the stack
                if (!isMatched(left, ch)) return false; // check if left and current char is matched
            }
        }
        
        return stack.isEmpty(); // if our stack is not empty, it means it is not balance.
    }
    
    private boolean isLeft(char ch) {
        return this.leftBrackets.contains(ch);
    }
    
    private boolean isRight(char ch) {
        return this.rightBrackets.contains(ch);
    }
    
    private boolean isMatched(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    } 
}
