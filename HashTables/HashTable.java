/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms.HashTables;
import java.util.*;
/**
 *
 * @author christopherii
 */
public class HashTable {
    private LinkedList<Entry>[] entries = new LinkedList[4];
    
    public void put(int key, String value) {
        Entry entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }
        
        getOrCreateBucket(key).add(new Entry(key, value));
    }
    
    public String get(int key) {
        Entry entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }
    
    public void remove(int key) {
        Entry entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }
    
    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }
    
    private LinkedList<Entry> getOrCreateBucket(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if (bucket == null)
            entries[index] = new LinkedList();
        
        return bucket;
    }
    
    private Entry getEntry(int key) {
        LinkedList<Entry> bucket = getBucket(key);
        
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.key == key)
                    return entry;
            }
        }
        
        return null;
    }
    
    private int hash(int number) {
        return number % entries.length;
    }
    
    private class Entry {
        private int key;
        private String value;
        private Entry next;
        
        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
