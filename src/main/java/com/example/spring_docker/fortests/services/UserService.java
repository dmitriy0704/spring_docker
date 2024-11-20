package com.example.spring_docker.fortests.services;

import com.example.spring_docker.fortests.dao.UserDao;
import com.example.spring_docker.fortests.model.User;

public class UserService {

    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public boolean checkUser(User user) throws Exception {
        User u = dao.getUserByUsername(user.getUsername());
        return u != null;
    }


}
