package com.example.BlogSite.Model;

import jakarta.persistence.Id;

import java.util.List;
import java.util.ArrayList;

public class Category {
    @Id
    private String id;

    private String name;

    private List<Post> posts = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
