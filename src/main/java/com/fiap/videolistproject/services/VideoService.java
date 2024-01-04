package com.fiap.videolistproject.services;

import com.fiap.videolistproject.dtos.VideoDTO;
import com.fiap.videolistproject.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public Flux<VideoDTO> findAll() {
        var videos = videoRepository.findAll();
        return videos.map(VideoDTO::new);
    }

    public Mono<VideoDTO> findById(Long id) {
        var video = videoRepository.findById(id);
        return video.map(VideoDTO::new);
    }

}
