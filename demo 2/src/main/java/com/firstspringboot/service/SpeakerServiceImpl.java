package com.firstspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstspringboot.repository.SpeakerRepository;
import com.firstspringboot.repository.HibernateSpeakerImpl;
import com.firstspringboot.model.Speaker;


@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	
	public SpeakerServiceImpl() {
		System.out.println("Empty Constructor!");
	}
	
	@Autowired
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("With parameter repository");
		repository = speakerRepository;
	}
	
	@Override
	public List<Speaker> findAll(){
		return repository.findAll();
	}
	
	
	public void setRepository(SpeakerRepository repository) {
		System.out.println("In Setter");
		this.repository = repository;
	}
}
