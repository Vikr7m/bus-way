package com.example.Busway.Backend.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "trip_driver")
public class TripDriver {

    @EmbeddedId
    private TripDriverId id;

    @Column(name = "assigned_at", insertable = false, updatable = false)
    private Timestamp assignedAt;

    // ===== Composite Key Class =====
    @Embeddable
    public static class TripDriverId implements Serializable {

        @Column(name = "trip_id", nullable = false)
        private Integer tripId;

        @Column(name = "driver_id", nullable = false)
        private Integer driverId;

        public TripDriverId() {}

        public TripDriverId(Integer tripId, Integer driverId) {
            this.tripId = tripId;
            this.driverId = driverId;
        }

        public Integer getTripId() {
            return tripId;
        }

        public void setTripId(Integer tripId) {
            this.tripId = tripId;
        }

        public Integer getDriverId() {
            return driverId;
        }

        public void setDriverId(Integer driverId) {
            this.driverId = driverId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TripDriverId)) return false;
            TripDriverId that = (TripDriverId) o;
            return Objects.equals(tripId, that.tripId) &&
                   Objects.equals(driverId, that.driverId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tripId, driverId);
        }
    }

    // ===== Getters and Setters =====

    public TripDriverId getId() {
        return id;
    }

    public void setId(TripDriverId id) {
        this.id = id;
    }

    public Timestamp getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(Timestamp assignedAt) {
        this.assignedAt = assignedAt;
    }
}

