package com.telisko.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alian {
    @Autowired
    Laptop laptop;
    public void code(){
        laptop.compile();
    }
}
