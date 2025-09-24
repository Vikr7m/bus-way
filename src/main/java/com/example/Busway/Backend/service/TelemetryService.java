package com.example.Busway.Backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Busway.Backend.DTO.TelemetryDTO;
import com.example.Busway.Backend.model.CurrentLocation;
import com.example.Busway.Backend.model.Telemetry;
import com.example.Busway.Backend.repository.CurrentLocationRepository;
import com.example.Busway.Backend.repository.TelemetryRepository;
import com.example.Busway.Backend.repository.TripRepository;

import java.time.Instant;
import java.time.LocalDateTime;

@Service
public class TelemetryService {

    @Autowired
    private TelemetryRepository telemetryRepository;

    @Autowired
    private CurrentLocationRepository currentLocationRepository;
    
    @Autowired
    private TripRepository tripRepository;

    public void saveTelemetry(TelemetryDTO dto) {
        LocalDateTime now = LocalDateTime.now();

        // 1. Save telemetry
        Telemetry telemetry = new Telemetry();

        telemetry.setVehId(dto.getVehId());
        telemetry.setLatitude(dto.getLatitude());
        telemetry.setLongitude(dto.getLongitude());
        telemetry.setSpeed(dto.getSpeed());
        telemetry.setHeading(dto.getHeading());
        telemetry.setTs(now);
        telemetryRepository.save(telemetry);
    }
    
    public String updateCuurentLocation(TelemetryDTO dto) {
    	LocalDateTime currentInstant = LocalDateTime.now();
    	currentLocationRepository.updateLocationByBusId(dto.getVehId(), dto.getLatitude(), dto.getLongitude(), dto.getSpeed(), dto.getHeading(), currentInstant);
    	saveTelemetry(dto);
    	return "success";
    }
    
    
}

