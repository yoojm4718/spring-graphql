package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {
    @QueryMapping
    public List<Post> postsByUserId(@Argument String userId) {
        List<Post> searchedPosts = Post.getByUserId(userId);
        return searchedPosts;
    }

    @QueryMapping
    public ArrayList<Post> posts() {
        return Post.getPosts();
    }

    @QueryMapping
    public Post postById(@Argument String postId) {
        return Post.getById(postId);
    }

    @SchemaMapping
    public User author(Post post) {
        return User.getById(post.getAuthorId());
    }
}