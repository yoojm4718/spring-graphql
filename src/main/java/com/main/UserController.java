package com.main;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @QueryMapping
    public User userById(@Argument String userId) {
        return User.getById(userId);
    }
}