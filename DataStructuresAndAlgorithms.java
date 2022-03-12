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
        CharFinder finder = new CharFinder();
        System.out.println("The repeated character: " + finder.findFirstRepeatedCharacter("a green apple"));
        System.out.println("Character.MIN_VALUE: " + finder.findFirstRepeatedCharacter("abcd"));
    }
    
}
