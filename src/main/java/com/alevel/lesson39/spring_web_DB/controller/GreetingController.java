package com.alevel.lesson39.spring_web_DB.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/all")
    public void getAll() {
        System.out.println("Hello Spring");
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, Spring!";
    }

    @GetMapping("/html")
    public String getHelloAsHtml() {
        return "<b>Hello, Spring!</b>";
    }

    @GetMapping("/marquee")
    public String getHelloGo() {
        return "<marquee>Hello, Spring!</marquee>";
    }

    @GetMapping("/response")
    public ResponseEntity getResponseEntity() {
        return ResponseEntity.ok("All is ok");
        // предоставляет код http-запроса 200
    }

    @GetMapping("/error")
    public ResponseEntity getErrorResponseEntity() {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error happened...");
        // BAD_REQUEST - на сервере произошла какая-то ошибка, упс...
    }
}
