package com.example.TodoList.Controllers.AuthenController;

import com.example.TodoList.DTOs.AuthenDTO.Register;
import com.example.TodoList.Models.UserModel.User;
import com.example.TodoList.Services.AuthenService.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/authentication")
public class Authentication {
    @Autowired
    private RegisterService registerService;
    @PostMapping("/register")
    public ResponseEntity<?> registerAccount(@RequestBody(required = true) Register registerObject) {
        User user = registerService.registerUser(registerObject);
        System.out.println(user);
        return ResponseEntity.ok().build();
    }
}
