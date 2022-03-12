/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author christopherii
 */
public class CharFinder {
    public char findFirstNonRepeatedCharacter(String word) {
        Map<Character, Integer> map = new HashMap(); // declare a hashmap
        
        char[] characters = word.toLowerCase().toCharArray(); // transform the given word into characters
        for (char ch : characters) { // iterate over the characters
            int count = map.containsKey(ch) ? map.get(ch) : 0; // get the value
            map.put(ch, count + 1); // put it in our map
        }
        
        for (char ch: characters) // iterate over again the characters
            if (map.get(ch) == 1) return ch; // return the current character that has a value of 1 in our map
        
        return 0; // return 0 if no non repeating characters.
    }
    
    public char findFirstRepeatedCharacter(String word) {
        Set<Character> set = new HashSet();
        for (char ch: word.toCharArray()) { // iterate over the given string
            if (set.contains(ch)) return ch;
            
            set.add(ch); // Add the character to the set
        }
        
        return Character.MIN_VALUE; // if no repeated character, return min value of the Character
    }
}
