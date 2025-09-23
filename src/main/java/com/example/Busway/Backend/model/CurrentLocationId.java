package com.example.Busway.Backend.model;


import java.io.Serializable;
import java.util.Objects;

public class CurrentLocationId implements Serializable {
    private Integer busId;
    private Integer tripId;

    public CurrentLocationId() {}
    public CurrentLocationId(Integer busId, Integer tripId) {
        this.busId = busId;
        this.tripId = tripId;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof CurrentLocationId)) return false;
        CurrentLocationId that = (CurrentLocationId) o;
        return Objects.equals(busId, that.busId) &&
               Objects.equals(tripId, that.tripId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busId, tripId);
    }
}

