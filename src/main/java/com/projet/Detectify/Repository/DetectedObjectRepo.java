package com.projet.Detectify.Repository;

import com.projet.Detectify.Model.DetectedObject;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DetectedObjectRepo extends MongoRepository<DetectedObject, String> {
    // Recherche d'objets détectés par nom
    List<DetectedObject> findByName(String name);

    // Recherche d'objets détectés par type
    List<DetectedObject> findByType(String type);

    // Recherche d'objets détectés avec une confiance minimale
    List<DetectedObject> findByConfidenceGreaterThan(double confidence);
}
