package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "events" )
	private List<Speaker> speakers = new ArrayList<>();
	
	private String name;
	private String country;
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public Event( String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void addSpeaker(Speaker speaker) {
		speakers.add(speaker);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
