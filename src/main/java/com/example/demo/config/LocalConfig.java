package com.example.demo.config;

import com.example.demo.dominio.entity.User;
import com.example.demo.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void startDB() {
        User u1 = new User(null, "Valdir", "valdir@mail.com", "123");
        User u2 = new User(null, "Luiz", "luiz@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}