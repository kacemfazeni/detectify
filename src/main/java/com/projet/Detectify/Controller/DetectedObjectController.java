package com.projet.Detectify.Controller;

import com.projet.Detectify.Model.DetectedObject;
import com.projet.Detectify.Service.DetectedObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detected-objects")
public class DetectedObjectController {

    @Autowired
    private DetectedObjectService detectedObjectService;

    @GetMapping
    public List<DetectedObject> getAllDetectedObjects() {
        return detectedObjectService.getAllDetectedObjects();
    }

    @GetMapping("/{id}")
    public Optional<DetectedObject> getDetectedObjectById(@PathVariable String id) {
        return detectedObjectService.getDetectedObjectById(id);
    }

    @PostMapping
    public DetectedObject createDetectedObject(@RequestBody DetectedObject detectedObject) {
        return detectedObjectService.saveDetectedObject(detectedObject);
    }

    @DeleteMapping("/{id}")
    public void deleteDetectedObject(@PathVariable String id) {
        detectedObjectService.deleteDetectedObject(id);
    }
}

