package com.example.Busway.Backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="telemetry")
public class Telemetry {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 private Integer vehId;
 private Double latitude;
 private Double longitude;
 private Float speed;
 private Float heading;
 private LocalDateTime ts = LocalDateTime.now();
 public Integer getId() {
	return id;
 }
 public void setId(Integer id) {
	this.id = id;
 }
 public Integer getVehId() {
	return vehId;
 }
 public void setVehId(Integer vehId) {
	this.vehId = vehId;
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
 public Float getSpeed() {
	return speed;
 }
 public void setSpeed(Float speed) {
	this.speed = speed;
 }
 public Float getHeading() {
	return heading;
 }
 public void setHeading(Float heading) {
	this.heading = heading;
 }
 public LocalDateTime getTs() {
	return ts;
 }
 public void setTs(LocalDateTime ts) {
	this.ts = ts;
 }
 public Telemetry(Integer id, Integer vehId, Double latitude, Double longitude, Float speed, Float heading,
		LocalDateTime ts) {
	super();
	this.id = id;
	this.vehId = vehId;
	this.latitude = latitude;
	this.longitude = longitude;
	this.speed = speed;
	this.heading = heading;
	this.ts = ts;
 }
 public Telemetry() {
	// TODO Auto-generated constructor stub
 }

 // Getters & Setters
 // ...
}
