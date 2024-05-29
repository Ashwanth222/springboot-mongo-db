package com.example.springboot_mongodb.repository;

import com.example.springboot_mongodb.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface TutorialRepository extends MongoRepository<Tutorial, String>,
        QuerydslPredicateExecutor<Tutorial> {
    List<Tutorial> findByPublished(boolean b);

    List<Tutorial> findByTitleContaining(String title);

    List<Tutorial> findByDescription(String description);

    List<Tutorial> findByDescriptionStartingWith(String d);

    List<Tutorial> findByDescriptionEndingWith(String number);

    @Query("{ 'description' : ?0 }")
    List<Tutorial> findTutorialsByDescriptionn(String description);

    @Query("{ 'description' : { $regex: ?0 } }")
    List<Tutorial> findTutorialsByDescriptionRegex(String regex);

    @Query("{ 'age' : { $gt: ?0, $lt: ?1 } }")
    List<Tutorial> findTutorialAgeBetween(Integer ageGT, Integer ageLT);
    List<Tutorial> findTutorialByAgeBetween(Integer age1, Integer age2);
}
