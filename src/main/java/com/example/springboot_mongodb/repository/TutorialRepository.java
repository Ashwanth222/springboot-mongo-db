package com.example.springboot_mongodb.repository;

import com.example.springboot_mongodb.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
    List<Tutorial> findByPublished(boolean b);

    List<Tutorial> findByTitleContaining(String title);
}
