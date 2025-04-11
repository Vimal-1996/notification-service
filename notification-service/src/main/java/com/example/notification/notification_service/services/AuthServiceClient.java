package com.example.notification.notification_service.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.notification.notification_service.DTO.AuthResponse;

@FeignClient(name = "auth-service", url = "http://AUTH-SERVICE/api/auth")
public interface AuthServiceClient {

    @PostMapping("/validate")
    AuthResponse validateToken(@RequestHeader("Authorization") String token);
}
