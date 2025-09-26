package com.example.Busway.Backend.DTO;

public class BusDTO {
	
	private Integer busId;
	private String regNo;
	private String numberPlate;
	private Integer capacity;
	private Integer occupnacy;
	
	
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
	public Integer getOccupnacy() {
		return occupnacy;
	}
	public void setOccupnacy(Integer occupnacy) {
		this.occupnacy = occupnacy;
	}
	
	
}
