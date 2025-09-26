package com.example.Busway.Backend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Busway.Backend.DTO.SendLocationDTO;
import com.example.Busway.Backend.DTO.TelemetryDTO;
import com.example.Busway.Backend.service.CurrentLocationService;
import com.example.Busway.Backend.service.TelemetryService;



@RestController
@RequestMapping("/bus")
@CrossOrigin(origins = "*") 
public class LocationController {
	
	@Autowired
	TelemetryService telemetryService;
	
	@Autowired
	CurrentLocationService currentLocationService;
	
	
	@PostMapping("/location")
	public String receiveTelemetry(@RequestBody TelemetryDTO dto) {
        return telemetryService.updateCuurentLocation(dto);
    }
	
	@GetMapping("currentloaction/{busId}")
	public SendLocationDTO sendCurrentLocation(@PathVariable Integer busId) {
		return currentLocationService.getCurrentLocationDetails(busId);
	}
}
