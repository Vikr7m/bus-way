package com.example.Busway.Backend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Busway.Backend.model.TelemetryDTO;
import com.example.Busway.Backend.service.TelemetryService;



@RestController
@RequestMapping("/bus")
@CrossOrigin(origins = "*") 
public class LocationController {
	
	@Autowired
	TelemetryService telemetryService;
	
	
	@PostMapping("/location")
	public String receiveTelemetry(@RequestBody TelemetryDTO dto) {
        telemetryService.saveTelemetry(dto);
        return "Location received and updated";
    }
}
