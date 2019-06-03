package com.alevel.lesson39.spring_web_DB.dto;

public class Calculator {
    private int first;
    private int second;

    public Calculator() {
    }

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
