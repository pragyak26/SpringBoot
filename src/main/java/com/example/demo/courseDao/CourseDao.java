package com.example.demo.courseDao;

import com.example.demo.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseDao extends JpaRepository<Course, Long>{
}
