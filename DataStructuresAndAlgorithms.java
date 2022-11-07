/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

import datastructuresandalgorithms.HashTables.*;

/**
 *
 * @author christopherii
 */
public class DataStructuresAndAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3,3,3, 4,4, 5,5};
        int mostRepeated = HashTableExercises.mostFrequent(numbers);// use the class
        System.out.println("Most repeated " + mostRepeated); // returns 3
    }
    
}
