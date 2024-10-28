package com.projet.Detectify.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "users") // Specify the MongoDB collection name
public class User {

    @Id // This annotation indicates that this field is the primary key
    private String id;
    private String email;
    private String password;
    private String zone;
    private String username;
    private String photoUrl;

    // Default constructor
    public User() {
    }

    // Constructor with parameters
    public User(String id, String email, String password, String zone, String username, String photoUrl) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.zone = zone;
        this.username = username;
        this.photoUrl = photoUrl;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
