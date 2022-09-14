package com.example.shopping;

import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
	int appleCost = 60;
	int orangeCost = 25;
	
	OrderResponse placeOrder(OrderRequest order) {
		OrderResponse resp = new OrderResponse();
		if(order.getApples() > 0) {
			resp.setApples(order.getApples() * 2);
			resp.setApplesCost(order.getApples() * this.appleCost);
		} 
		if(order.getOranges() > 0) {
			resp.setOranges(order.getOranges());
			resp.setOrangesCost(((order.getOranges()%3) * this.orangeCost) + ((order.getOranges()/3) * this.orangeCost * 2));
		}
		resp.setTotalCost(resp.getApplesCost() + resp.getOrangesCost());
		return resp;
	}
}
