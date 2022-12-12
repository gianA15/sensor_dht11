package com.grupo3.pi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.grupo3.pi.models.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {

	List<Sensor> findAllByuserid(@Param("userid") Long userid);
}
