package com.main;

import java.util.Arrays;
import java.util.ArrayList;

import org.apache.el.stream.Stream;

public class Post {

    private String id;
    private String title;
    private String content;
    private int likes;
    private String authorId;

    public Post(String id, String title, String content, String authorId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.likes = 0;
        this.authorId = authorId;
    }

    private static ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(
        new Post("1", "안녕하세요 1.", "안녕하세요안녕하세요 1", "1"),
        new Post("2", "안녕하세요 2.", "안녕하세요안녕하세요 2", "3"),
        new Post("3", "안녕하세요 3.", "안녕하세요안녕하세요 3", "2")
    ));

    public static ArrayList<Post> getByUserId(String userId) {
        ArrayList<Post> searchedPosts = new ArrayList<Post>();

        for(int i = 0; i < posts.size(); i++) {
            Post currPost = posts.get(i);
            if(currPost.getAuthorId().equals(userId)) searchedPosts.add(currPost);
        }

        return searchedPosts;
    }

    public static ArrayList<Post> getPosts() {
        return posts;
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }
}