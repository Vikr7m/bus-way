package com.example.Busway.Backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Busway.Backend.model.CurrentLocation;
import com.example.Busway.Backend.model.Telemetry;
import com.example.Busway.Backend.model.TelemetryDTO;
import com.example.Busway.Backend.repository.CurrentLocationRepository;
import com.example.Busway.Backend.repository.TelemetryRepository;

import java.time.LocalDateTime;

@Service
public class TelemetryService {

    @Autowired
    private TelemetryRepository telemetryRepository;

    @Autowired
    private CurrentLocationRepository currentLocationRepository;

    public void updateCurrentLocation(TelemetryDTO dto) {
        LocalDateTime now = LocalDateTime.now();

        // 1. Save telemetry
        Telemetry telemetry = new Telemetry();

        telemetry.setLatitude(dto.getLatitude());
        telemetry.setLongitude(dto.getLongitude());
        telemetry.setSpeed(dto.getSpeed());
        telemetry.setHeading(dto.getHeading());
        telemetry.setTs(now);
        telemetryRepository.save(telemetry);

    }
}

