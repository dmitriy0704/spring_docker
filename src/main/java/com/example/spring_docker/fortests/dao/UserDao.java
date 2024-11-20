package com.example.spring_docker.fortests.dao;


import com.example.spring_docker.fortests.model.User;

public interface UserDao {

    User getUserByUsername(String username) throws Exception;

}
