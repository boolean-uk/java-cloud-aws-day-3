package com.booleanuk;

import com.booleanuk.TodoApp.controllers.TodoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
// We use direct @Import instead of @ComponentScan to speed up cold starts
// @ComponentScan(basePackages = "my.service.controller")
@Import({ TodoController.class })
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
