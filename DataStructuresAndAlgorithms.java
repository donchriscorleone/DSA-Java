/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

import datastructuresandalgorithms.Array.Array;
import datastructuresandalgorithms.LinkedList.LinkedList;
import java.util.Arrays;

/**
 *
 * @author christopherii
 */
public class DataStructuresAndAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array arr = new Array(2);
        arr.add(2);
        arr.add(3);
        
        arr.removeAt(0);
        System.out.println("Index of 3 is " + arr.indexOf(3));
        arr.print();
        System.out.println("Size " + arr.size());
    }
    
}
