package com.booleanuk;
import com.booleanuk.TodoApp.controllers.RegisterController;
import com.booleanuk.TodoApp.controllers.TodoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication

@Import({ TodoController.class, RegisterController.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
