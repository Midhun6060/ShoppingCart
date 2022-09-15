package com.example.shopping;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class ShoppingApplicationTests {

	@Autowired
	ShoppingService shoppingService;
	
	@Test
	void contextLoads() {
		OrderRequest req = new OrderRequest();
		req.setApples(5);
		req.setOranges(5);
		OrderResponse resp = shoppingService.placeOrder(req);
		assertEquals(10, resp.getApples());
		assertEquals(5, resp.getOranges());
		assertEquals(300, resp.getApplesCost());
		assertEquals(100, resp.getOrangesCost());
		assertEquals(400, resp.getTotalCost());
		
		ArrayList<OrderResponse> orders = shoppingService.getAllOrders();
		assertEquals(1, orders.get(0).getOrderId());
		
		resp = shoppingService.getOrderDetails(1);
		assertEquals(1, orders.get(0).getOrderId());
	}

}
