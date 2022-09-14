package com.example.shopping;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
	int appleCost = 60;
	int orangeCost = 25;
	int orderId = 1;
	ArrayList<OrderResponse> orders = new ArrayList<OrderResponse>();
	
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
		resp.setOrderId(this.orderId);
		this.orderId++;
		orders.add(resp);
		return resp;
	}
	
	ArrayList<OrderResponse> getAllOrders() {
		return this.orders;
	}
	
	OrderResponse getOrderDetails(int orderId) {
		if(orderId>0 && orderId <= orders.size()) return orders.get(orderId-1);
		return null;
	}
}
