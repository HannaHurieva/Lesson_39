package com.alevel.lesson39.spring_web_DB.dto;



public class Terminator {
    private String username;
    private String surname;

    public Terminator() {
    }

    public Terminator(String username, String surname) {
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
