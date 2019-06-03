package com.alevel.lesson39.spring_web_DB.dto;


import javax.validation.constraints.NotEmpty;

public class Node {
    @NotEmpty(message = "Username of object cannot be empty")
    private String username;

    @NotEmpty(message = "I'll be back! xoxo")
    private String surname;

    public Node() {
    }

    public Node(String username, String surname) {
        this.username = username;
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
