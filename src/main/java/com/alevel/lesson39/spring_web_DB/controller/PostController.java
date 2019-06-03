package com.alevel.lesson39.spring_web_DB.controller;

import com.alevel.lesson39.spring_web_DB.dto.Calculator;
import com.alevel.lesson39.spring_web_DB.dto.Node;
import com.alevel.lesson39.spring_web_DB.dto.Terminator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("/console")
    public void processPostRequest() {
        System.out.println("I have processed post request");
    }

    @PostMapping("/terminator")
    public String processPostBody(@RequestBody Terminator terminator) {
        return terminator.getUsername() + " " + terminator.getSurname();
    }

    @PostMapping("/calc")
    public Integer processPostBody(@RequestBody Calculator calculator) {
        return calculator.getFirst()*calculator.getSecond();
    }

    @PostMapping("/valid")
    public String processPostBody(@Valid @RequestBody Node node) {
        return node.getUsername() + " " + node.getSurname();
    }
}
