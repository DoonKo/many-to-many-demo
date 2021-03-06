package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Event;

@Repository
public interface EventDao extends CrudRepository<Event, Integer>{

}
