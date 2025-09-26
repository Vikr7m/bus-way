package com.example.Busway.Backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Busway.Backend.DTO.SendLocationDTO;
import com.example.Busway.Backend.model.CurrentLocation;
import com.example.Busway.Backend.repository.CurrentLocationRepository;


@Service
public class CurrentLocationService {
	
	@Autowired
	CurrentLocationRepository currentLocationRepository;

	public SendLocationDTO getCurrentLocationDetails(Integer busId) {
		SendLocationDTO result  = new SendLocationDTO();
		CurrentLocation currentLocation = currentLocationRepository.findByBusId(busId);
		result.setLatitude(currentLocation.getLatitude());
		result.setLongitude(currentLocation.getLongitude());
		result.setSpeed(currentLocation.getSpeed());
		result.setHeading(currentLocation.getHeading());
		return result;
	}

}
