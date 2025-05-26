package com.luizbarros.order_services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizbarros.order_services.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double totalDiscount (Order order) {
		return order.getBasic() * (order.getDiscount() / 100);
	}
	
	public double total (Order order) {
		
		return order.getBasic() - totalDiscount(order) + shippingService.shipment(order);
	}
}
