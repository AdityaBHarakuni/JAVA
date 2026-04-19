package com.swing.basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p2 extends JFrame implements ActionListener {
    JLabel messageLabel;
    JButton btnIndia, btnSrilanka;

    public p2() {
        setTitle("Country Button App");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");
        messageLabel = new JLabel("Press a button");

        // Adding Action Listeners
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        add(btnIndia);
        add(btnSrilanka);
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIndia) {
            messageLabel.setText("India is pressed");
        } else if (e.getSource() == btnSrilanka) {
            messageLabel.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new p2();
    }
}
