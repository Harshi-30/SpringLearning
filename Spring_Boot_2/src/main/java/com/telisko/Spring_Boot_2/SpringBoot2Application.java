package com.telisko.Spring_Boot_2;

import com.telisko.Spring_Boot_2.Service.LaptopService;
import com.telisko.Spring_Boot_2.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot2Application.class);
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
//		Alien alien = context.getBean(Alien.class);
//		alien.code();
//
//		System.out.println(alien.getAge());

	}

}
