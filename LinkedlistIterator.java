package com.linkedlist;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class LinkedlistIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        
        // Start at index 1 (2nd element)
        Iterator it = list.listIterator(1);

        System.out.println("Iterating from 2nd position:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
