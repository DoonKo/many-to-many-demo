package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Speaker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String expertise;
	public Speaker() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany
	private List<Event> events = new ArrayList<>();
	
	public Speaker(String name, String expertise) {
		super();
		this.name = name;
		this.expertise = expertise;
	}
	
	public void addEvent(Event event) {
		events.add(event);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	

	
	
}
 