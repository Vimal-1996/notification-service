package com.example.notification.notification_service.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.notification.notification_service.DTO.OrderDTO;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="order-notification-topic", groupId = "notification-service-group")
    public void consume(OrderDTO order) {
        // Logic to notify the user (via email, SMS, etc.)
        System.out.println("Order placed: " + order.getId() + ", sending notification...");
    }
}
