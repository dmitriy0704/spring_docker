package com.example.spring_docker;

import com.example.spring_docker.entity.Product;
import com.example.spring_docker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDockerApplication implements CommandLineRunner {


    @Autowired
    private ProductRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(null, "name");
        repository.save(product);

        final List<Product> all = repository.findAll();
        System.out.println(all);
    }
}
