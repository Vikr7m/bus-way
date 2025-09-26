package com.example.Busway.Backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Busway.Backend.DTO.BusDTO;
import com.example.Busway.Backend.model.Bus;
import com.example.Busway.Backend.repository.BusRepository;
import com.example.Busway.Backend.repository.BusTypeRepository;

@Service
public class BusService {
	
	@Autowired
	private BusRepository busRepository;
	
	@Autowired
	private BusTypeRepository busTypeRepository;
	
	public BusDTO getBusDTODetails(Integer busId) {
		BusDTO result = new BusDTO();
		Bus bus = busRepository.findByBusyId(busId);
		result.setBusId(busId);
		result.setBusType(busTypeRepository.getBusTypeByBusTypeId(bus.getBusType()));
		result.setRegNo(bus.getRegNo());
		result.setNumberPlate(bus.getNumberPlate());
		return result;
	}

	

}
