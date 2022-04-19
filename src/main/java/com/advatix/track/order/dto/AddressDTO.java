package com.advatix.track.order.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddressDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String doorNumber;
	private String street;
	private String city;
	private String state;
	private String country;
	private Integer zipCode;
	
	
	

}
