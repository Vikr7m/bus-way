package com.example.Busway.Backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Busway.Backend.model.CurrentLocation;
import com.example.Busway.Backend.model.CurrentLocationId;

import java.util.List;

@Repository
public interface CurrentLocationRepository extends JpaRepository<CurrentLocation, CurrentLocationId> {

    // Optional: find current location by busId
    List<CurrentLocation> findByBusId(Integer busId);

    // Optional: find current location by tripId
    List<CurrentLocation> findByTripId(Integer tripId);

    @Query(nativeQuery = true, value = "ALTER TABLE current_location SET latitude = :latitude , longitude = :longitude WHERE bus_id = :VehId")
	void updateCurrentLocationbyBusId(Integer vehId, Double latitude, Double longitude);
}

