package com.swing.labs;

import javax.swing.*;
import java.awt.*;

public class p2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Tabs");
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("RED", createColorPanel(Color.RED));
        tabbedPane.addTab("BLUE", createColorPanel(Color.BLUE));
        tabbedPane.addTab("GREEN", createColorPanel(Color.GREEN));

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static JPanel createColorPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }
}
