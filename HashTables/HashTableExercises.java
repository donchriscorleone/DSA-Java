/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.HashTables;
import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author christopherii
 */
public class HashTableExercises {
    
    public static int mostFrequent(int[] numbers) {
        Map<Integer, Integer> map = new HashMap(); // create an instance of the map class
        // loop through the numbers parameter
        
        for (int number : numbers) {
            int count = (map.containsKey(number)) ? map.get(number) : 0;// get the count value
            map.put(number, count + 1);// store it in our map
        }
        
        // create an instance of a Entry class
        Entry<Integer, Integer> mostRepeatedEntry = null; // for now, it is null
        // loop through the map
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (mostRepeatedEntry == null)
                mostRepeatedEntry = entry;
            else if (entry.getValue() > mostRepeatedEntry.getValue())
                mostRepeatedEntry = entry;
        }
        
        // return the value of the mostRepeated
        return (mostRepeatedEntry != null) ? mostRepeatedEntry.getValue() : 0; // return 0 if null
    }
}
