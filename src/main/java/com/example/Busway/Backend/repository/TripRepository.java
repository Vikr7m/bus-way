package com.example.Busway.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Busway.Backend.model.Trips;

public interface TripRepository extends JpaRepository<Trips, Integer>{

}
