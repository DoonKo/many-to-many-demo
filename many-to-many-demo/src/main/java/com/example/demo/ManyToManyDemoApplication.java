package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.EventService;

@SpringBootApplication
public class ManyToManyDemoApplication implements CommandLineRunner{

	private final EventService eventService;
	
	
	public ManyToManyDemoApplication(EventService eventService) {
		super();
		this.eventService = eventService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		eventService.createDB();
	}

}
