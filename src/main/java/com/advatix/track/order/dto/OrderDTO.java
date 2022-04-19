package com.advatix.track.order.dto;

import java.io.Serializable;
import java.util.List;

import com.advatix.track.order.entity.Address;

import lombok.Data;

@Data
public class OrderDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long orderId;
	
	private String productName;
	
	private String description;
	
	private Integer quantity;
	
	private Double billAmount;
	
	private List<Address> address;

}
