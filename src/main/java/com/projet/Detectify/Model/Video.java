package com.projet.Detectify.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "videos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    @Id
    private String id;
    private String title;
    private String url;
    private List<DetectedObject> detectedObjects;

    public Video(String title, String url, List<DetectedObject> detectedObjects) {
        this.title = title;
        this.url = url;
        this.detectedObjects = detectedObjects;
}}
