package com.socialbase.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UserDashboard extends JFrame {
    private JList<String> postList;

    public UserDashboard(List<String> posts) {
        setTitle("User  Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String post : posts) {
            listModel.addElement(post);
        }
        postList = new JList<>(listModel);
        JButton createPostButton = new JButton("Create New Post");

        createPostButton.addActionListener(e -> {
            PostCreationFrame postCreationFrame = new PostCreationFrame();
            postCreationFrame.setVisible(true);
        });

        add(new JScrollPane(postList), BorderLayout.CENTER);
        add(createPostButton, BorderLayout.SOUTH);
    }
}