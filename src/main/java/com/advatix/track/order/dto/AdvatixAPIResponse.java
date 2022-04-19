package com.advatix.track.order.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AdvatixAPIResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	private String statusCode;
	private String message;
	private Object data;

}
