package com.grupo3.pi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.grupo3.pi.models.Sensor;
import com.grupo3.pi.models.User;
import com.grupo3.pi.repository.SensorRepository;
import com.grupo3.pi.repository.UserRepository;
import com.grupo3.pi.services.SensorService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/sensor")
public class SensorController {
	
	@Autowired
	private SensorService sensorService;

	
	@GetMapping("/temperaturas")
	public ResponseEntity<List<Sensor>> findAll(){
		return ResponseEntity.ok(sensorService.findAll());
	}
	
	@PostMapping("/temperatura")
	public ResponseEntity<Sensor> create(@RequestBody Sensor sensor){
		return new ResponseEntity<>(sensorService.create(sensor), HttpStatus.CREATED);
	}
	
	@GetMapping("/temperaturas/{userid}")
	public List<Sensor> findByUserId(@PathVariable("userid") Long userid){
		return sensorService.findAllByUserId(userid);
	}
}
