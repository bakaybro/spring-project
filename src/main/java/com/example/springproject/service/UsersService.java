package com.example.springproject.service;

import com.example.springproject.entity.Users;

import java.util.List;

public interface UsersService {
    Users save(Users users);

    Integer counter();
}
