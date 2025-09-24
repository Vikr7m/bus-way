package com.example.Busway.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Busway.Backend.model.Trips;

public interface TripRepository extends JpaRepository<Trips, Integer>{
	
	@Query(nativeQuery = true, value = "SELECT trip_id FROM trip WHERE bus_id = :vehId")
	Integer findTripIdByBusId(Integer vehId);

}
