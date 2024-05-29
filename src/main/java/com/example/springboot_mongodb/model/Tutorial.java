package com.example.springboot_mongodb.model;

import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@QueryEntity
@Document(collection = "tutorial")
public class Tutorial {
    @Id
    private String id;

    private String title;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String description;
    private boolean published;

    public Tutorial() {

    }

    public Tutorial(String title, String description,Integer age, boolean published) {
        this.title = title;
        this.age = age;
        this.description = description;
        this.published = published;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ",age= " + age + ", desc=" + description + ", published=" + published + "]";
    }
}