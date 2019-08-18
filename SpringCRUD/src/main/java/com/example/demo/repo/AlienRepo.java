package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	
	List<Alien> findBytname(String tname);
	
	@Query("from Alien where aid=?1")
	List<Alien> findByCustomAid(int aid);
}
