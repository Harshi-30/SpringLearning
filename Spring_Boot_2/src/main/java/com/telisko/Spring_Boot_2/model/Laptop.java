package com.telisko.Spring_Boot_2.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compile by laptop");
    }
}
