package com.fiap.videolistproject.repositories;

import com.fiap.videolistproject.entities.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, Long> {
}
