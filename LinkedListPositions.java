package com.linkedlist;

import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListPositions {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        for (int p = 0; p < list.size(); p++) {
            System.out.println("Position " + p + ": " + list.get(p));
        }
    }
}
