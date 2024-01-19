package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao{
	private double latitude, longitude, altitude; 
	
	public Posicao(double latitude, double longitude, double altitude) {
		setLatitude(latitude);
		setLongitude(longitude);
		setAltitude(altitude);	 
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return this.altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public String toString() {
		return ("Posição:"+ getLatitude()+", "+ getLongitude()+", "+ getAltitude());
	}
}