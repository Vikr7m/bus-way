package com.example.Busway.Backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Busway.Backend.model.CurrentLocation;
import com.example.Busway.Backend.model.CurrentLocationId;

import jakarta.transaction.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CurrentLocationRepository extends JpaRepository<CurrentLocation, CurrentLocationId> {

    // Optional: find current location by busId
    List<CurrentLocation> findByBusId(Integer busId);

    // Optional: find current location by tripId
    List<CurrentLocation> findByTripId(Integer tripId);

	
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = """
        UPDATE current_location
        SET latitude = :latitude,
            longitude = :longitude,
            speed = :speed,
            heading = :heading,
            updated_at = :currentInstant
        WHERE bus_id = :vehId
    """)
    int updateLocationByBusId(@Param("vehId") Integer vehId,
                              @Param("latitude") Double latitude,
                              @Param("longitude") Double longitude,
                              @Param("speed") Float speed,
                              @Param("heading") Float heading,
                              @Param("currentInstant") LocalDateTime currentInstant);

}

