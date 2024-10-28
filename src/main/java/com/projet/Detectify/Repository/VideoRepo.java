package com.projet.Detectify.Repository;

import com.projet.Detectify.Model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VideoRepo extends MongoRepository <Video,String>{
    // Recherche de vidéos par titre
    List<Video> findByTitle(String title);

    // Recherche de vidéos par URL
    List<Video> findByUrl(String url);
}
