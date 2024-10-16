package com.booleanuk.TodoApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class RegisterController {
    @GetMapping("register")
    public ResponseEntity<String> registerUser() {

        return ResponseEntity.ok("User registered successfully");
    }

}
