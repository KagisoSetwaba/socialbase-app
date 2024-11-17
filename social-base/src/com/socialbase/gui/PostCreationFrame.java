package com.socialbase.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PostCreationFrame extends JFrame {
    private JTextArea postContentArea;

    public PostCreationFrame() {
        setTitle("Create Post");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        postContentArea = new JTextArea();
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = postContentArea.getText();
                // Call PostController to create a new post
                // If successful, notify user and close frame
            }
        });

        add(new JScrollPane(postContentArea), BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);
    }
}