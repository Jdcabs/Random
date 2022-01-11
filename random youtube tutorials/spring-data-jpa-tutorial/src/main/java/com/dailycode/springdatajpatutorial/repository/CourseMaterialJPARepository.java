package com.dailycode.springdatajpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycode.springdatajpatutorial.model.CourseMaterial;

@Repository
public interface CourseMaterialJPARepository extends JpaRepository<CourseMaterial, Long>{

}
