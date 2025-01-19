package com.example.TodoList.Controllers.AuthenController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/authentication")
public class Authentication {
    @PostMapping("/test")
    public ResponseEntity<?> test(@RequestBody Map<String, String> testObj) {
        System.out.println(testObj.get("value"));
        return ResponseEntity.ok().build();
    }
}
