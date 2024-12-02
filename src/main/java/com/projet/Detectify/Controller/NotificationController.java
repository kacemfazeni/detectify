package com.projet.Detectify.Controller;

import com.projet.Detectify.Model.Notification;
import com.projet.Detectify.Service.NotificationService;
import com.projet.Detectify.Service.WebSocketNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private WebSocketNotificationService webSocketNotificationService;

    /**
     * Create a new notification and broadcast it to WebSocket clients.
     *
     * @param notification the notification to create.
     * @return the created notification.
     */
    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
        Notification savedNotification = notificationService.saveNotification(notification);
        webSocketNotificationService.sendNotification(savedNotification); // Broadcast notification
        return ResponseEntity.status(HttpStatus.CREATED).body(savedNotification);
    }

    /**
     * Retrieve all notifications.
     *
     * @return a list of all notifications.
     */
    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    /**
     * Retrieve a specific notification by its ID.
     *
     * @param id the ID of the notification to retrieve.
     * @return the notification if found, wrapped in a ResponseEntity.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Notification> getNotificationById(@PathVariable String id) {
        return notificationService.getNotificationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    /**
     * Update the status of a notification.
     *
     * @param id     the ID of the notification to update.
     * @param status the new status to set.
     * @return the updated notification.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Notification> updateNotificationStatus(
            @PathVariable String id,
            @RequestParam String status) {
        try {
            Notification updatedNotification = notificationService.updateNotificationStatus(id, status);
            webSocketNotificationService.sendNotification(updatedNotification); // Broadcast update
            return ResponseEntity.ok(updatedNotification);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
