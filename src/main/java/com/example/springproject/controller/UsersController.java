package com.example.springproject.controller;

import com.example.springproject.entity.Users;
import com.example.springproject.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
@Log
@CrossOrigin
public class UsersController {

    private final UsersService usersService;

    @PostMapping("/counter")
    public String inquiryPost() {
        Users user = new Users();
        user.setName("Post");
        usersService.save(user);
        return null;
    }

    @GetMapping("/counter")
    public Integer counter() {
        Users user = new Users();
        user.setName("Get");
        usersService.save(user);
        return usersService.counter();
    }
}
