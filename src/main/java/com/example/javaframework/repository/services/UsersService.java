package com.example.javaframework.repository.services;

import com.example.javaframework.dto.request.UsersCreationRequest;
import com.example.javaframework.entity.Users;
import com.example.javaframework.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public Users createUser(UsersCreationRequest user) {
        Users newUser = new Users();
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());

        return usersRepository.save(newUser);
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Users getUserId(Long userId) {
        return usersRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public Users updateUser(Long userId, UsersCreationRequest request) {
        Users user = getUserId(userId);
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return usersRepository.save(user);
    }

    public void deleteUser(Long userId) {
        usersRepository.deleteById(userId);
    }
}
