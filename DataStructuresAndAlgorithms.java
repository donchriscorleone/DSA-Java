/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

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
        // Lets test
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        System.out.println(Arrays.toString(list.toArray()));
//        list.reverse();
        System.out.println(list.getKthFromTheEnd(1));
        list.printMiddle();

//        System.out.println(list.indexOf(20));
//        list.removeFirst();
    }
    
}
