package com.alevel.lesson39.spring_web_DB.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@RestController = @Controller + @ResponseBody
//
//@RestController превращает помеченный класс в Spring-бин.
// Этот бин для конвертации входящих/исходящих данных использует Jackson message converter.
// Как правило целевые данные представлены в json или xml.

@RequestMapping("/get")
public class MyController {

    @GetMapping("/name")
    public ResponseEntity getResponseEntity() {
        return ResponseEntity.ok("<marquee>Hanna Hurieva</marquee>");
        // предоставляет код http-запроса 200
    }

    // localhost:1986/get/name?param=gameofthrones&key=value
    @GetMapping("/param")
    public ResponseEntity getParam(@RequestParam String name){
        return ResponseEntity.ok("Hello, " + name);
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return "Hello, " + name;
    }

    @GetMapping("/sum")
    public Integer getSum(@RequestParam int a, int b) {
        return a+b;
    }
}
