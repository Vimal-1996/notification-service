package com.example.notification.notification_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.notification.notification_service.models.CustomerResponse;

@FeignClient(name = "customer-service", url = "http://CUSTOMER-SERVICE/api/customers")
public interface CustomerServiceClient {

    @GetMapping("/{customerId}")
    CustomerResponse getCustomerById(@PathVariable("customerId") Long customerId);
}
