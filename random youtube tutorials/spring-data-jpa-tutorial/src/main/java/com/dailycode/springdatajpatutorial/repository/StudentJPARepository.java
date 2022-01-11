package com.dailycode.springdatajpatutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dailycode.springdatajpatutorial.model.Student;

@Repository
public interface StudentJPARepository extends JpaRepository<Student, Long>{
	
	List<Student> findByLastName(String lastName);
	 
	//JPQL
	@Query("Select s.firstName from Student s where s.emailId = ?1")
	String getStudentFirstNameByEmailId(String emailId);
	
	//NATIVE
	@Query(
		value = "Select * From tbl_student s where s.email_address = ?1",
		nativeQuery = true
		)
	Student getStudentByEmailIdNative(String emailId);
	
	
	//NATIVE with PARAMETER
	@Query(
			value = "Select * From tbl_student s where s.email_address = :emailId",
			nativeQuery = true
			)
	Student getStudentByEmailIdNativeWithParam(@Param("emailId") String emailId);
		
	
	//Native with transactional and modifiying
	@Modifying
	@Transactional
	@Query(
		value = "UPDATE tbl_student set first_name = :firstName where email_address = :emailId",
		nativeQuery = true
		)
	int updateStudentFirstNameByEmailId(String firstName, String emailId);
}
