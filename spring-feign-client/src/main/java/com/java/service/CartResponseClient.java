package com.java.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.model.CartResponse;

@FeignClient(url = "http://104.237.9.45:32122",name = "CartResponseFeignClient")
@Component
public interface CartResponseClient {
	@GetMapping(value = "/api/v1/customers/{id}/cart")
	public CartResponse getRespose(@PathVariable (value = "id") long id) ;

}
