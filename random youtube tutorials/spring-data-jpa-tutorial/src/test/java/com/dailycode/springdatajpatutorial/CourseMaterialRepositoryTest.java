package com.dailycode.springdatajpatutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycode.springdatajpatutorial.model.Course;
import com.dailycode.springdatajpatutorial.model.CourseMaterial;
import com.dailycode.springdatajpatutorial.repository.CourseMaterialJPARepository;

@SpringBootTest
class CourseMaterialRepositoryTest {

	@Autowired
	private CourseMaterialJPARepository courseMaterialJPARepository;

	@Test
	public void AddCourseMaterial() {
		
		Course course = Course.builder()
				.courseTitle("facebook")
				.courseCredit(6)
				.build();
		
		CourseMaterial courseMaterial = 
				CourseMaterial.builder()
				.url("www.facebook.com")
				.course(course)
				.build();
		
		courseMaterialJPARepository.save(courseMaterial);
	}
	
	@Test
	public void findAll() {
		List<CourseMaterial> courseMaterial = 
				courseMaterialJPARepository.findAll();
		
		System.out.println("Course Material: " + courseMaterial);
		
	}
}
