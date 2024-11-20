package com.example.spring_docker.endpoints;

import com.example.spring_docker.endpoints.entity.UserEntity;
import com.example.spring_docker.endpoints.repo.UserRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/users")
public class UserController {

    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public @ResponseBody List<UserEntity> allUsers() {
        return userRepo.findAll();
    }
}
