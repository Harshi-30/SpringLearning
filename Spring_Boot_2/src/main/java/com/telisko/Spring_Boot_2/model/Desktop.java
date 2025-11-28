package com.telisko.Spring_Boot_2.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compile by desktop");
    }
}
