package com.linkedlist;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        
        Iterator it = list.descendingIterator();

        System.out.println("Reverse order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
