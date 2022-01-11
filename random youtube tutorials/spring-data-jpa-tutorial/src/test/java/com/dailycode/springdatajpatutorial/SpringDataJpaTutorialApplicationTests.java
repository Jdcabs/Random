package com.dailycode.springdatajpatutorial;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycode.springdatajpatutorial.model.Guardian;
import com.dailycode.springdatajpatutorial.model.Student;
import com.dailycode.springdatajpatutorial.repository.StudentJPARepository;
import com.dailycode.springdatajpatutorial.repository.StudentRepository;



@SpringBootTest
class SpringDataJpaTutorialApplicationTests {
	
	@Autowired
	private StudentJPARepository studentRepository;
	
	@Autowired
	private StudentRepository repository;
	
	@Test
	public void saveStudent() {
	Student student = Student.builder()
			.emailId("john@gmail.com")
			.firstName("johndavid")
			.lastName("Cabal")
			//.guardianEmail("rose@gmail.com")
			//.guardianName("rose")
			//.guardianMobile("09999951317")
			.build();
	
	studentRepository.save(student);	 
	}
	
	@Test
	public void saveStudentWithGuardian() {
		
		Guardian guardian = Guardian.builder()
				.email("Rey@gmail.com")
				.mobile("09683228845")
				.name("reycabal")
				.build();
		
		Student student = Student.builder()
				.firstName("janiyah")
				.lastName("Cabal")
				.emailId("janiyah@gmail.com")
				.guardian(guardian)
				.build();
	studentRepository.save(student);
	}
	
//	@Test
//	public void findByFirstName() {
//		
//		List<Student> student = 
//				studentRepository.findByFirstName("janiyah");
//		
//		System.out.println("Student = " + student);
//	}
	
	@Test
	public void findByFirstname() {
		
		List<Student> student = 
				repository.findByStudentLastName("Cabal");
		System.out.println(student);
	}
	
	@Test
	public void list(){
		List<Student> student =
				repository.list();
		
		System.out.println("Students = " + student);
	}
	
	//Test for the JPQL 
	@Test 
	public void getStudentFirstNameByEmailId() {
		String firstName = 
				studentRepository.getStudentFirstNameByEmailId("john@gmail.com");
		
		System.out.println("First Name: " + firstName);
	}
	
	//Test for the native sql
	@Test
	public void getStudentByEmailIdNative() {
		Student student = 
				studentRepository.getStudentByEmailIdNative("john@gmail.com");
		
		System.out.println("Student Details = " + student);
	}
	
	//Test for the Native with Param SQL
	@Test
	public void getStudentByEmailIdNativeWithParam() {
		Student student = 
				studentRepository.getStudentByEmailIdNativeWithParam("janiyah@gmail.com");
				
		System.out.println("Student = " + student);
	}
	
	//Test for the Native SQL that can update a row in the database
	@Test
	public void updateStudentFirstNameByEmailId() {
		int update = 
				studentRepository.updateStudentFirstNameByEmailId("Janiyah Riona", "janiyah@gmail.com");
		
		System.out.println("Updated count " + update);
	}
}
