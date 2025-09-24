package com.example.Busway.Backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stop")
public class Stop {

    @Id
    @Column(name = "stop_id", nullable = false, length = 10)
    private String stopId;

    @Column(name = "stop_name", nullable = false, length = 100)
    private String stopName;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @Column(name = "stop_type", nullable = false, length = 20)
    private String stopType;

    // ===== Getters and Setters =====

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }
}

