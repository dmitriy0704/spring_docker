package com.example.spring_docker.repo;

import com.example.spring_docker.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<UserEntity, String> {
List<UserEntity> findByUsername(String username);
List<UserEntity> findAll();
}
