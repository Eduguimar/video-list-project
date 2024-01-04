package com.fiap.videolistproject.controllers;

import com.fiap.videolistproject.dtos.VideoDTO;
import com.fiap.videolistproject.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public ResponseEntity<Flux<VideoDTO>> findAll() {
        var videosDTO = videoService.findAll();

        return ResponseEntity.ok(videosDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mono<VideoDTO>> findById(@PathVariable Long id) {
        var videoDTO = videoService.findById(id);

        return ResponseEntity.ok(videoDTO);
    }
}
