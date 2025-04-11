package com.example.notification.notification_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.notification.notification_service.models.OrderResponse;

@FeignClient(name = "order-service", url = "http://ORDER-SERVICE/api/orders")
public interface OrderServiceClient {

    @GetMapping("/{orderId}")
    OrderResponse getOrderById(@PathVariable("orderId") Long orderId);
}