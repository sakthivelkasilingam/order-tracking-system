package com.advatix.track.order.service;

import com.advatix.track.order.dto.AdvatixAPIResponse;
import com.advatix.track.order.dto.OrderDTO;

public interface OrderService {
	
	
	public AdvatixAPIResponse createOrder(OrderDTO orderDTO);

}
