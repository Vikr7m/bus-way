package com.example.Busway.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Busway.Backend.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>{

	@Query(nativeQuery = true, value = "SELECT * FROM bus WHERE bus_id = :busId")
	Bus findByBusyId(Integer busId);
	
}
