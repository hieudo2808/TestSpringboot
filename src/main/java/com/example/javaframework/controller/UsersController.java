package com.example.javaframework.controller;

import com.example.javaframework.dto.request.UsersCreationRequest;
import com.example.javaframework.entity.Users;
import com.example.javaframework.repository.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping
    Users createUser(@RequestBody UsersCreationRequest user) {
        return usersService.createUser(user);
    }

    @GetMapping
    List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{userId}")
    Users getUser(@PathVariable("userId") Long userId) {
        return usersService.getUserId(userId);
    }

    @PutMapping("/{userId}")
    Users updateUser(@PathVariable Long userId, @RequestBody UsersCreationRequest user) {
        return usersService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    void deleteUser(@PathVariable Long userId) {
        usersService.deleteUser(userId);
    }
}
