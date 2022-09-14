package com.example.shopping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class ShoppingController {
	@Autowired
	private ShoppingService shoppingService;
	
	@PostMapping(value = "/placeOrder", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse placeOrder(@RequestBody OrderRequest request) 
	{
		OrderResponse resp = shoppingService.placeOrder(request);
		
		return resp;
	}
}
