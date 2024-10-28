package com.projet.Detectify.Service;

import com.projet.Detectify.Model.DetectedObject;
import com.projet.Detectify.Repository.DetectedObjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DetectedObjectService {
    @Autowired
    private DetectedObjectRepo detectedObjectRepo;

    public List<DetectedObject> getAllDetectedObjects() {
        return detectedObjectRepo.findAll();
    }

    public Optional<DetectedObject> getDetectedObjectById(String id) {
        return detectedObjectRepo.findById(id);
    }

    public List<DetectedObject> getDetectedObjectsByName(String name) {
        return detectedObjectRepo.findByName(name);
    }

    public DetectedObject saveDetectedObject(DetectedObject detectedObject) {
        return detectedObjectRepo.save(detectedObject);
    }

    public void deleteDetectedObject(String id) {
        detectedObjectRepo.deleteById(id);
    }
}
