package com.example.spring_docker.endpoints.repo;

import com.example.spring_docker.endpoints.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<UserEntity, Long> {


   List<UserEntity> findAll();

}
