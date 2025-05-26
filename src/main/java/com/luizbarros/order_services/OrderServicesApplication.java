package com.luizbarros.order_services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServicesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OrderServicesApplication.class, args);		
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("System ON!");
	}
}
