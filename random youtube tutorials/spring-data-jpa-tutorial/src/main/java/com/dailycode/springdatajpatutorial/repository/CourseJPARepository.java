package com.dailycode.springdatajpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycode.springdatajpatutorial.model.Course;

@Repository
public interface CourseJPARepository extends JpaRepository<Course, Long>{

}
