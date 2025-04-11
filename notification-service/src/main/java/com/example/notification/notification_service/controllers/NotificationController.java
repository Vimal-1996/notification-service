package com.example.notification.notification_service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notification.notification_service.DTO.NotificationDTO;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationDTO request) {
        // Use AWS SNS, email service etc.
    	return new ResponseEntity<>("notification Sent", HttpStatus.OK);
    }
}
