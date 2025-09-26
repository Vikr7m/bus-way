package com.example.Busway.Backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Busway.Backend.model.Bus;
import com.example.Busway.Backend.model.CurrentLocation;
import com.example.Busway.Backend.repository.CurrentLocationRepository;

@Service
public class TripService {
	
	@Autowired
    private CurrentLocationRepository locationRepository;

    private static final double EARTH_RADIUS_KM = 6371; // Radius of Earth in km

    /**
     * Finds all buses within 'radiusKm' kilometers from the given latitude and longitude
     */
    public List<Integer> findNearbyBuses(double latitude, double longitude) {
    	 double radiusKm = 5.0;
        List<CurrentLocation> allLocations = locationRepository.findAll();

        List<Integer> nearbyBuses = new ArrayList<>();

        for (CurrentLocation loc : allLocations) {
            double distance = calculateDistance(latitude, longitude,
                                                loc.getLatitude(), loc.getLongitude());
            if (distance <= radiusKm) {
                nearbyBuses.add(loc.getBusId()); // assuming CurrentLocation has a getBus() method
            }
        }

        return nearbyBuses;
    }

    /**
     * Haversine formula to calculate distance between two lat/lon points
     */
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(Math.toRadians(lat1)) *
                   Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS_KM * c;
    }
	
}
