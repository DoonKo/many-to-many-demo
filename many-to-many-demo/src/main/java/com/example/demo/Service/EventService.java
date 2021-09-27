package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EventDao;
import com.example.demo.entities.Event;
import com.example.demo.entities.Speaker;

@Service
public class EventService {
	@Autowired
	private EventDao eventDao;
	
	@Transactional
	public void createDB() {
		
		Event e1 = new Event("Java", "Japan");
		Event e2 = new Event("Python", "India");
		Event e3 = new Event("Angular", "USA");
		
		Speaker s1 = new Speaker("John", "Java");
		Speaker s2 = new Speaker("William", "CS");
		Speaker s3 = new Speaker("Thomas", "Security");
		
		//Mapping
		e1.addSpeaker(s1);
		s1.addEvent(e1);
		e1.addSpeaker(s2);
		s2.addEvent(e1);
		e1.addSpeaker(s3);
		s3.addEvent(e1);
		e2.addSpeaker(s2);
		s2.addEvent(e2);
		e3.addSpeaker(s3);
		s3.addEvent(e3);
		
		eventDao.save(e1);
		eventDao.save(e2);
		eventDao.save(e3);
	}
}
