package com.telisko.Spring_Boot_2.repo;

import com.telisko.Spring_Boot_2.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Save the data");
    }
}
