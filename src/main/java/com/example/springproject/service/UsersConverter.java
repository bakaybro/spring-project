package com.example.springproject.service;

import com.example.springproject.dto.UsersDto;
import com.example.springproject.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUsersDtoUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setName(usersDto.getName());
        usersDto.setLogin(usersDto.getName());
        usersDto.setEmail(usersDto.getEmail());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        return UsersDto.builder()
                .id(users.getId())
                .name(users.getName())
                .login(users.getLogin())
                .email(users.getEmail())
                .build();
    }
}
