package com.example.Busway.Backend.DTO;


public class SendLocationDTO {
	 
	    private Double latitude;
	    private Double longitude;
	    private Float speed;
	    private Float heading;

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

		
}
