package com.swing.labs;

import javax.swing.*;
import java.awt.*;

public class p4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CMY Tabs");
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Cyan", createColorPanel(Color.CYAN));
        tabbedPane.addTab("Magenta", createColorPanel(Color.MAGENTA));
        tabbedPane.addTab("Yellow", createColorPanel(Color.YELLOW));

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
