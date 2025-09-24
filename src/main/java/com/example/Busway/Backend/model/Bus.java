package com.example.Busway.Backend.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Integer busId;

    @Column(name = "reg_no", nullable = false, unique = true, length = 20)
    private String regNo;

    @Column(name = "number_plate", length = 20)
    private String numberPlate;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "model_name", length = 50)
    private String modelName;

    @Column(name = "manufacture_year")
    private Integer manufactureYear;

    @Column(name = "bus_type")
    private Integer busType;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "enum('Active','Inactive','Maintenance') default 'Active'")
    private Status status = Status.Active;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_type", columnDefinition = "enum('Diesel','Electric','CNG','Hybrid')")
    private FuelType fuelType;

    @Column(name = "remarks", columnDefinition = "TEXT")
    private String remarks;

    // ===== Enums =====
    public enum Status {
        Active, Inactive, Maintenance
    }

    public enum FuelType {
        Diesel, Electric, CNG, Hybrid
    }

    // ===== Getters and Setters =====

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Integer manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Integer getBusType() {
        return busType;
    }

    public void setBusType(Integer busType) {
        this.busType = busType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
