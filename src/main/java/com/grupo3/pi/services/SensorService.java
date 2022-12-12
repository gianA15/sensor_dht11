package com.grupo3.pi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo3.pi.models.Sensor;
import com.grupo3.pi.repository.SensorRepository;

@Service
public class SensorService implements ISensorService {
	
	@Autowired
	private SensorRepository sensorRepo;

	@Override
	public List<Sensor> findAll() {
		return sensorRepo.findAll();
	}

	@Override
	public Optional<Sensor> findById(Long id) {
		return sensorRepo.findById(id);
	}

	@Override
	public Sensor create(Sensor sensor) {
		return sensorRepo.save(sensor);
	}

	@Override
	public Sensor update(Sensor sensor) {
		return sensorRepo.save(sensor);
	}

	@Override
	public void delete(Long id) {
		sensorRepo.deleteById(id);
		
	}

	@Override
	public List<Sensor> findAllByUserId(Long userid) {
		return sensorRepo.findAllByuserid(userid);
	}

	




}
