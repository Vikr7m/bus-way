package com.example.Busway.Backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Busway.Backend.repository.BusRepository;

@Service
public class BusService {
	
	@Autowired
	private BusRepository busRepository;

}
