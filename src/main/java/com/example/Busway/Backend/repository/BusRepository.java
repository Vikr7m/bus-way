package com.example.Busway.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Busway.Backend.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>{
	
}
