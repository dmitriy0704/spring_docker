package com.example.spring_docker.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class UsersRestControllerTest {
    UsersRestController usersRestController;

    public void setUp(){
        usersRestController = new UsersRestController(null);
    }

    @Test
    void getUsers() throws Exception {
        List<UsersRestController.User> users = usersRestController.getUsers();
    }
}