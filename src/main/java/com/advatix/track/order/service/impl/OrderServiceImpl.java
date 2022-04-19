package com.advatix.track.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advatix.track.order.dto.AdvatixAPIResponse;
import com.advatix.track.order.dto.OrderDTO;
import com.advatix.track.order.entity.Order;
import com.advatix.track.order.repository.OrderRepository;
import com.advatix.track.order.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ObjectMapper mapper;

	@Override
	public AdvatixAPIResponse createOrder(OrderDTO orderDTO) {
		Order order = mapper.convertValue(orderDTO, Order.class);
		Order savedEntity = orderRepository.save(order);
		AdvatixAPIResponse advatixResponse = new AdvatixAPIResponse();
		advatixResponse.setStatus("Success");
		advatixResponse.setStatusCode("201");
		advatixResponse.setData("Order is created successfully order id: {}" + savedEntity.getOrderId());
		return advatixResponse;
	}

}
