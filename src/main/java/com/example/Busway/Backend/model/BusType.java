package com.example.Busway.Backend.model;


import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bus_type")
public class BusType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_type_id")
    private Integer busTypeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false, columnDefinition = "enum('Town','Mofussil','Ghat')")
    private Category category;

    @Column(name = "class_name", nullable = false, length = 50)
    private String className;

    @Column(name = "operator_name", length = 50)
    private String operatorName;

    @Column(name = "features", columnDefinition = "TEXT")
    private String features;

    @Column(name = "fare_basis", length = 50)
    private String fareBasis;

    @Column(name = "free_scheme_flag", nullable = false)
    private Boolean freeSchemeFlag = false;

    @Column(name = "ac_flag", nullable = false)
    private Boolean acFlag = false;

    @Column(name = "last_mile_flag", nullable = false)
    private Boolean lastMileFlag = false;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private Timestamp updatedAt;

    // ===== Enum for Category =====
    public enum Category {
        Town, Mofussil, Ghat
    }

    // ===== Getters and Setters =====

    public Integer getBusTypeId() {
        return busTypeId;
    }

    public void setBusTypeId(Integer busTypeId) {
        this.busTypeId = busTypeId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public Boolean getFreeSchemeFlag() {
        return freeSchemeFlag;
    }

    public void setFreeSchemeFlag(Boolean freeSchemeFlag) {
        this.freeSchemeFlag = freeSchemeFlag;
    }

    public Boolean getAcFlag() {
        return acFlag;
    }

    public void setAcFlag(Boolean acFlag) {
        this.acFlag = acFlag;
    }

    public Boolean getLastMileFlag() {
        return lastMileFlag;
    }

    public void setLastMileFlag(Boolean lastMileFlag) {
        this.lastMileFlag = lastMileFlag;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}

