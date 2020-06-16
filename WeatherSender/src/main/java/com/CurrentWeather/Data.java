package com.CurrentWeather;
import java.io.Serializable;

public class Data implements Serializable
{
	private static final long serialVersionUID = 1L;
	private double temperature;
	private String location;
	private double feelslike;
	private String date_time;

	public String getDate_time() {
		return date_time;
	}



	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}



	public double getTemperature() {
		return temperature;
	}



	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public double getFeelslike() {
		return feelslike;
	}



	public void setFeelslike(double feelslike) {
		this.feelslike = feelslike;
	}



	@Override
	public String toString()
	{
		return "Temperatue: "+ temperature +"\nfeels likes: "+feelslike+"\nlocation: "+location+"date & time: "+date_time;
	}


}
