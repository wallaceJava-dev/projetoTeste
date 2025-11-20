package com.example.demo.service;

import com.example.demo.dominio.entity.User;

public interface UserService {
    User findById(Integer id);
}
