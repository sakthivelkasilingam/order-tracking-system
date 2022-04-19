package com.advatix.track.order.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_management")
public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "orderSeq", sequenceName = "SEQ_ORDER_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderSeq")
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_description")
	private String description;
	
	@Column(name="product_quantity")
	private Integer quantity;
	
	@Column(name="bill_amount")
	private Double billAmount;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private List<Address> address;

}
