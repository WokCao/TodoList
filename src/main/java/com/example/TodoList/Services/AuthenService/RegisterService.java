package com.example.TodoList.Services.AuthenService;

import com.example.TodoList.DTOs.AuthenDTO.Register;
import com.example.TodoList.Models.UserModel.User;
import com.example.TodoList.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private UserRepository userRepository;
    public User registerUser(Register registerDTO) {
        if (userRepository.findByEmail(registerDTO.getEmail())) {
            throw new RuntimeException("Email already in use");
        }

        // Create an encoder with strength 16
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
        String result = encoder.encode(registerDTO.getPassword());

        User user = new User(registerDTO.getFullName(), result, registerDTO.getPhoneNumber(), registerDTO.getEmail(), registerDTO.getGender(), false);
        return userRepository.save(user);
    }
}
