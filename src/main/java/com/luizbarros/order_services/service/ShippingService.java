package com.luizbarros.order_services.service;

import org.springframework.stereotype.Service;

import com.luizbarros.order_services.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order  order) {
		
		Double fee;
		
		if (order.getBasic() < 100.0) {
			fee = 20.0;
		}else if (order.getBasic() < 200.0) {
			fee = 12.0;
		}else {
			fee = 0.0;
		}
		
		return fee;
	}
}
