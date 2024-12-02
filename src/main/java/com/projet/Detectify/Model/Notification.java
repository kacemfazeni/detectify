package com.projet.Detectify.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "notifications")
public class Notification {

    @Id
    private String id;
    private String zone;
    private String objectDetails;
    private String severity;
    private String status; // Add this field
    private LocalDateTime timestamp;

    // Default constructor
    public Notification() {
    }

    // Parameterized constructor
    public Notification(String zone, String objectDetails, String severity, String status, LocalDateTime timestamp) {
        this.zone = zone;
        this.objectDetails = objectDetails;
        this.severity = severity;
        this.status = status;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getObjectDetails() {
        return objectDetails;
    }

    public void setObjectDetails(String objectDetails) {
        this.objectDetails = objectDetails;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
