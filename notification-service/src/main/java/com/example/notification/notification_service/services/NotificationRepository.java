package com.example.notification.notification_service.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notification.notification_service.models.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
