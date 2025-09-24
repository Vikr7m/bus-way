package com.example.Busway.Backend.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "route_stop")
public class RouteStop {

    @EmbeddedId
    private RouteStopId id;

    @Column(name = "stop_order", nullable = false)
    private Integer stopOrder;

    // ===== Composite Key Class =====
    @Embeddable
    public static class RouteStopId implements Serializable {

        @Column(name = "route_id", nullable = false)
        private Integer routeId;

        @Column(name = "stop_id", nullable = false, length = 10)
        private String stopId;

        public RouteStopId() {}

        public RouteStopId(Integer routeId, String stopId) {
            this.routeId = routeId;
            this.stopId = stopId;
        }

        public Integer getRouteId() {
            return routeId;
        }

        public void setRouteId(Integer routeId) {
            this.routeId = routeId;
        }

        public String getStopId() {
            return stopId;
        }

        public void setStopId(String stopId) {
            this.stopId = stopId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof RouteStopId)) return false;
            RouteStopId that = (RouteStopId) o;
            return Objects.equals(routeId, that.routeId) &&
                   Objects.equals(stopId, that.stopId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(routeId, stopId);
        }
    }

    // ===== Getters and Setters =====

    public RouteStopId getId() {
        return id;
    }

    public void setId(RouteStopId id) {
        this.id = id;
    }

    public Integer getStopOrder() {
        return stopOrder;
    }

    public void setStopOrder(Integer stopOrder) {
        this.stopOrder = stopOrder;
    }
}
