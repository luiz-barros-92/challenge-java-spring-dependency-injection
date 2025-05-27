package com.luizbarros.order_services;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luizbarros.order_services.entities.Order;
import com.luizbarros.order_services.service.OrderService;

@SpringBootApplication
public class OrderServicesApplication implements CommandLineRunner{
	
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderServicesApplication.class, args);		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("---Order Data---");
		
		System.out.print("Code: ");
		Integer code = sc.nextInt();		
		
		System.out.print("Basic value: ");
		Double basic = sc.nextDouble();
		
		System.out.print("Discount(%): ");
		Double discount = sc.nextDouble();
		
		
		Order order = new Order(code, basic, discount);
		
		System.out.printf("%nOrder code: %d%nTotal value: $%.2f%n", order.getCode(), orderService.total(order));
	}
}
