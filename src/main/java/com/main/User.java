package com.main;

import java.util.Arrays;
import java.util.List;

public class User {
    private String id;
    private String profileImg;
    private String username;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(String id, String profileImg, String username) {
        this.id = id;
        this.profileImg = profileImg;
        this.username = username;
    }

    private static List<User> Users = Arrays.asList(
            new User("1", "엘리스"),
            new User("2", "캐터필러"),
            new User("3", "체셔")
    );

    public static User getById(String id) {
        return Users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }
}