package com.example.notification.notification_service.DTO;

import java.time.LocalDateTime;

import com.example.notification.notification_service.models.NotitficationStatus;

import jakarta.persistence.Column;

public class NotificationDTO {
	private Long id;
	
	private Long userId;
	
	private String message;
	
	private NotitficationStatus status;
	
	private LocalDateTime timestamp = LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NotitficationStatus getStatus() {
		return status;
	}

	public void setStatus(NotitficationStatus status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
