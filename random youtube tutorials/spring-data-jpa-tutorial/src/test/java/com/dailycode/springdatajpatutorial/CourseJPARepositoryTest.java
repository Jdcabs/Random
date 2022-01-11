package com.dailycode.springdatajpatutorial;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycode.springdatajpatutorial.model.Course;
import com.dailycode.springdatajpatutorial.repository.CourseJPARepository;

@SpringBootTest
class CourseJPARepositoryTest {
	
	@Autowired
	private CourseJPARepository repository;
	
	@Test
	public void printCourses() {
		List<Course> course = 
				repository.findAll();
		
		System.out.println("Course: " + course);
				
	}
}
