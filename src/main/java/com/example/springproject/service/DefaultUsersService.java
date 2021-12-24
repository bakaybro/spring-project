package com.example.springproject.service;

import com.example.springproject.entity.Users;
import com.example.springproject.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultUsersService implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Integer counter() {
        return usersRepository.findAll().size();
    }

    @Override
    public List<Users> getReport() {
        return usersRepository.findAll();
    }
}
