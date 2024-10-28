package com.projet.Detectify.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "detected_objects")
public class DetectedObject {
    @Id
    private String id;
    private String name;
    private String type;
    private double confidence;

    public DetectedObject(String name, String type, double confidence) {
        this.name = name;
        this.type = type;
        this.confidence = confidence;
    }
}
