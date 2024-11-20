package com.example.spring_docker.fortests.dao;

import com.example.spring_docker.fortests.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    private UserDao dao;

    // JUnit tests:

    @BeforeEach
    public void setUp(){
        this.dao = new UserDaoImpl();
    }

    @Test
    public void getUserByUsername_ShouldReturnTrue() throws Exception {
        User remy = dao.getUserByUsername("remy@gmail.com");
        assertNotNull(remy);
        assertEquals("remy@gmail.com", remy.getUsername());
    }

    @Test
    public void getUserByUsername_NullUser() throws Exception {
        User alex = dao.getUserByUsername("alex@gmail.com");
        assertNull(alex);
    }
}