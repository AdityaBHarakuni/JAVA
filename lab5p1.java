package com.swing.labs;

import javax.swing.*;
import javax.swing.event.*;

public class p1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List");
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", 
                             "France", "Great Britain", "Japan", "Africa", 
                             "Greenland", "Singapore"};

        JList<String> list = new JList<>(countries);
        
        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                System.out.println("Selected: " + list.getSelectedValue());
            }
        });

        frame.add(new JScrollPane(list));
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
