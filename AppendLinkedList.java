package com.linkedlist;

import java.util.LinkedList;
import java.util.Arrays;

public class AppendLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green"));
        
        list.offerLast("Pink");
        
        System.out.println("Updated List: " + list);
    }
}
