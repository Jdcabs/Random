package com.firstspringboot.repository;

import com.firstspringboot.model.Speaker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository("speakerRepository")
public class HibernateSpeakerImpl implements SpeakerRepository {

	
	@Override
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Johndavid");
		speaker.setLastName("Cabal");
		
		speakers.add(speaker);
		
		return speakers;
	}
}
  