package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.CartResponse;
import com.java.service.CartResponseClient;

@RestController
public class CartResponseController {
	
	@Autowired
	private CartResponseClient client;
	
	@GetMapping("/cart/{id}")
	public CartResponse getResponse(@PathVariable(value = "id") long id) {
		return client.getRespose(id);
	}

}
