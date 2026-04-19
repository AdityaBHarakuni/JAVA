package com.linkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;

public class SwapLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("First", "Second", "Third", "Fourth"));
        
        // Swaps index 0 and index 2
        Collections.swap(list, 0, 2);
        
        System.out.println("List after swap: " + list);
    }
}
