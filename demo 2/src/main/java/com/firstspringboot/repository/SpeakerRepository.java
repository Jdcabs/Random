package com.firstspringboot.repository;

import java.util.List;

import com.firstspringboot.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}