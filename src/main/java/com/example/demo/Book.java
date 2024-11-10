package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {

    @Value("Вино из одуванчиков")
    private String name;

    public String getNameBook() {
        return name;
    }
}
