package com.telisko.Spring_Boot_2.Service;

import com.telisko.Spring_Boot_2.repo.LaptopRepository;
import com.telisko.Spring_Boot_2.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap)
    {
        repo.save(lap);
    }
    public boolean isGoodForProg(Laptop lap){
        return true;
    }

}
