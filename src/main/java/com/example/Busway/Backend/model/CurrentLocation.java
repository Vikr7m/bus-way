package com.example.Busway.Backend.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "current_location")
@IdClass(CurrentLocationId.class) // <--- important
public class CurrentLocation {

    @Id
    @Column(name = "bus_id", nullable = false)
    private Integer busId;

    @Id
    @Column(name = "trip_id", nullable = false)
    private Integer tripId;


    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @Column(name = "speed")
    private Float speed;

    @Column(name = "heading")
    private Float heading;

    @Column(name = "accuracy")
    private Float accuracy;

    @Column(name = "updated_at", nullable = true,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    // Default constructor
    public CurrentLocation() {}

    // All-args constructor
    public CurrentLocation(Integer busId, Integer tripId,  Double latitude, Double longitude,
                           Float speed, Float heading, Float accuracy, LocalDateTime updatedAt) {
        this.busId = busId;
        this.tripId = tripId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.heading = heading;
        this.accuracy = accuracy;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public Integer getBusId() { return busId; }
    public void setBusId(Integer busId) { this.busId = busId; }

    public Integer getTripId() { return tripId; }
    public void setTripId(Integer tripId) { this.tripId = tripId; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public Float getSpeed() { return speed; }
    public void setSpeed(Float speed) { this.speed = speed; }

    public Float getHeading() { return heading; }
    public void setHeading(Float heading) { this.heading = heading; }

    public Float getAccuracy() { return accuracy; }
    public void setAccuracy(Float accuracy) { this.accuracy = accuracy; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
