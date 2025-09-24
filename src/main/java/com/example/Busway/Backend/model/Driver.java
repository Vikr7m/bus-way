package com.example.Busway.Backend.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @Column(name = "driver_id", nullable = false)
    private Integer driverId;  // Must be set manually unless AUTO_INCREMENT is added in DB

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "phone", nullable = false, unique = true, length = 15)
    private String phone;

    @Column(name = "license_no", nullable = false, unique = true, length = 50)
    private String licenseNo;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    // ===== Getters and Setters =====

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}

