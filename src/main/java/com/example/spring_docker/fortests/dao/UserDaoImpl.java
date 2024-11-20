package com.example.spring_docker.fortests.dao;

import com.example.spring_docker.fortests.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<User> users;

    public UserDaoImpl() {
        users = List.of(
                new User("olesya@gmail.com","GUEST"),
                new User("kirill@gmail.com","USER"),
                new User("remy@gmail.com","ADMIN")
        );
    }

    @Override
    public User getUserByUsername(String username) throws Exception {
        return users.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }
}
