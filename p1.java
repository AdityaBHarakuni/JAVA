package com.swing.basics;

import javax.swing.*;
import java.awt.*;

public class p1 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Hello Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);
        frame.setLayout(new FlowLayout());

        // Create the label with specific message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");
        
        // Set font: Plain, Size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));
        
        // Set color: Blue
        label.setForeground(Color.BLUE);

        // Add to frame and display
        frame.add(label);
        frame.setVisible(true);
    }
}
