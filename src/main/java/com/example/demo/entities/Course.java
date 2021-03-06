package com.example.demo.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private Long id;
    private String title;
    private String description;

    public Course() {
        super();
    }

    public Course(Long id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
