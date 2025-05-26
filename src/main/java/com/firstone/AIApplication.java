package com.firstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AIApplication {

    public static void main(String[] args) {
        SpringApplication.run(AIApplication.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}