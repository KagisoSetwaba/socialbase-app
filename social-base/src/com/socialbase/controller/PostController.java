package com.socialbase.controller;

import com.socialbase.model.Post;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostController {
    private Map<Integer, Post> posts = new HashMap<>(); // Simulating a database with a HashMap
    private int postIdCounter = 1; // To generate unique post IDs

    // Create a new post
    public Post createPost(int userId, String content) {
        Post newPost = new Post(postIdCounter++, userId, content, new Timestamp(System.currentTimeMillis()));
        posts.put(newPost.getPostId(), newPost);
        return newPost;
    }

    // Retrieve posts by user ID
public List<Post> getPostsByUserId(int userId) {
    List<Post> userPosts = new ArrayList<>();
    if (posts != null) { // Ensure posts is not null
        for (Post post : posts.values()) {
            if (post.getUserId() == userId) { // Fixed method name
                userPosts.add(post);
            }
        }
    }
    return userPosts;
}


    // Retrieve all posts
    public List<Post> getAllPosts() {
        return new ArrayList<>(posts.values());
    }
}