package com.projet.Detectify.Service;

import com.projet.Detectify.Model.Video;
import com.projet.Detectify.Repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    @Autowired
    private VideoRepo videoRepository;

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Optional<Video> getVideoById(String id) {
        return videoRepository.findById(id);
    }

    public List<Video> getVideosByTitle(String title) {
        return videoRepository.findByTitle(title);
    }

    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(String id) {
        videoRepository.deleteById(id);
    }
}

