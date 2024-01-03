package com.fiap.videolistproject.repositories;

import com.fiap.videolistproject.entities.Video;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends ReactiveMongoRepository<Video, Long> {
}
