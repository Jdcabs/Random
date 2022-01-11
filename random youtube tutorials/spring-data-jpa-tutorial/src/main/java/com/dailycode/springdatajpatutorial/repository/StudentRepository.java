package com.dailycode.springdatajpatutorial.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dailycode.springdatajpatutorial.model.Student;

@Repository
public class StudentRepository {

	@Autowired
	private StudentJPARepository jpaRepository;
	
	
	public List<Student> findByStudentLastName(String firstName) {
		return jpaRepository.findByLastName(firstName);
	}
	
	public List<Student> list() {
		return jpaRepository.findAll();
	}
	
}
