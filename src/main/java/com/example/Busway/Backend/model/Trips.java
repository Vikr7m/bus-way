package com.example.Busway.Backend.model;


import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "trip")
public class Trips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_id")
    private Integer tripId;

    @Column(name = "bus_id", nullable = false)
    private Integer busId;

    @Column(name = "route_id", nullable = false)
    private Integer routeId;
    
    @Column(name = "driver_id")
    private Integer driverId;

	@Column(name = "start_time", nullable = false)
    private Timestamp startTime;

    @Column(name = "end_time")
    private Timestamp endTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "enum('Scheduled','Ongoing','Completed','Cancelled') default 'Scheduled'")
    private Status status = Status.Scheduled;

    // ===== Enum for Status =====
    public enum Status {
        Scheduled, Ongoing, Completed, Cancelled
    }

    // ===== Getters and Setters =====

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}
    
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
