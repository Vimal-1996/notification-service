package com.example.notification.notification_service.DTO;

import java.math.BigDecimal;

import com.example.notification.notification_service.models.OrderStatus;


public class OrderDTO {
private Long id;
	
	private int customerId;
	
	private BigDecimal totalPrice;
	
	private OrderStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
}
}
