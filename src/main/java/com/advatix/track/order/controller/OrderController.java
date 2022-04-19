package com.advatix.track.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.advatix.track.order.dto.AdvatixAPIResponse;
import com.advatix.track.order.dto.OrderDTO;
import com.advatix.track.order.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/createNewOrder")
	@ResponseBody
	public ResponseEntity<AdvatixAPIResponse> createNewOrder(@RequestBody OrderDTO orderDTO) {
		AdvatixAPIResponse response = new AdvatixAPIResponse();
		try {
			return ResponseEntity.ok(orderService.createOrder(orderDTO));
		} catch (Exception e) {
			log.error("Error occured while create new order. {}",e.getMessage());
			response.setStatus("Failed");
			response.setMessage("Failed to create the order due to: " + e.getMessage());
			response.setStatusCode("500");
			return ResponseEntity.ok(response);
		}

	}

}
