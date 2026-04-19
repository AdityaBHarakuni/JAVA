package com.swing.basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p3 extends JFrame {
    JLabel statusLabel;

    public p3() {
        setTitle("Image Button Event");
        setSize(500, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (Ensure filenames match your local files)
        JButton clockBtn = new JButton("Digital Clock", new ImageIcon("clock.png"));
        JButton glassBtn = new JButton("Hour Glass", new ImageIcon("hourglass.png"));
        statusLabel = new JLabel("Select an icon");

        // Action Listener for Clock
        clockBtn.addActionListener(e -> statusLabel.setText("Digital Clock is pressed"));

        // Action Listener for Hour Glass
        glassBtn.addActionListener(e -> statusLabel.setText("Hour Glass is pressed"));

        add(clockBtn);
        add(glassBtn);
        add(statusLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new p3();
    }
}
