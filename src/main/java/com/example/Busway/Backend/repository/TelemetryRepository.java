package com.example.Busway.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Busway.Backend.model.Telemetry;

import java.util.List;

@Repository
public interface TelemetryRepository extends JpaRepository<Telemetry, Integer> {

	
}
