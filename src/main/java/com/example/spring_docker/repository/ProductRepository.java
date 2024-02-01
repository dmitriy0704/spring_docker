package com.example.spring_docker.repository;

import com.example.spring_docker.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
