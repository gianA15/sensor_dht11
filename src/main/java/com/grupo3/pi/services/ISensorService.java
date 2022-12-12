package com.grupo3.pi.services;

import java.util.List;
import java.util.Optional;

import com.grupo3.pi.models.Sensor;

public interface ISensorService {
	
	List<Sensor> findAll();
	
	Optional<Sensor> findById(Long id);
	
	Sensor create(Sensor sensor);
	
	Sensor update(Sensor sensor);
	
	void delete(Long id);
	
	List<Sensor> findAllByUserId(Long userid);
}
