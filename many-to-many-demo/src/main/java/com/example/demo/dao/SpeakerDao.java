package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Speaker;
@Repository
public interface SpeakerDao extends CrudRepository<Speaker, Integer>{

}
