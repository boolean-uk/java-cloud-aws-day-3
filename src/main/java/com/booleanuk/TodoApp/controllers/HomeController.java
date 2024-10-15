package com.booleanuk.TodoApp.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {
    @GetMapping("/")
    public String redirect() {
        return "Please redirect to /todos";
    }
}
