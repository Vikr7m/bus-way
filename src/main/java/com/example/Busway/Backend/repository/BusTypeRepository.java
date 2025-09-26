package com.example.Busway.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Busway.Backend.model.BusType;

public interface BusTypeRepository extends JpaRepository<BusType , Integer>{
	
	@Query(nativeQuery = true, value = "SELECT class_name FROM bus_type WHERE bus_typ_id = :busType")
	String getBusTypeByBusTypeId(Integer busType);

}
