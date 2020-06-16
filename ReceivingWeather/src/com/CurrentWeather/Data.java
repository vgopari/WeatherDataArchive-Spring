package com.CurrentWeather;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private double temperature;
	private String location;
	private double feelslike;
	private String date_time;
	HttpServletRequest request;
	HttpServletResponse response;
	

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
	public String getDate_time() {
		return date_time;
	}



	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	


	@Override
	
	public String toString()
	{
		return "Temperatue: "+ temperature +"\nfeels likes: "+feelslike+"\nlocation: "+location+"date & time: "+date_time;
	}
	
	

    public Data() {
    	
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		
		out.println("Temperatue: "+ temperature +"\nfeels likes: "+feelslike+"\nlocation: "+location+"date & time: "+date_time);
		
		out.println("</html></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
	}

}
