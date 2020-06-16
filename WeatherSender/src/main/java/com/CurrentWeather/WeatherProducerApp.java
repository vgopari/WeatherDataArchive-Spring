package com.CurrentWeather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class WeatherProducerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		WeatherSender messageSender = context.getBean(WeatherSender.class);
try {
			
			URL u = new URL("http://api.weatherapi.com/v1/current.json?key=83d7567ab23f4759a6043312202504&q=manchippa");
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String inputLine;
			
			StringBuffer response = new StringBuffer();
			
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				
			}in.close();
			
			//System.out.println(response.toString());
			
			JSONObject obj_JSONObject=new JSONObject(response.toString());
			
			JSONObject obj_JSONObject1 = obj_JSONObject.getJSONObject("current");
			JSONObject obj_JSONObject2 = obj_JSONObject.getJSONObject("location");

			double temperature = obj_JSONObject1.getDouble("temp_c");
			String location =  obj_JSONObject2.getString("name")+" "+obj_JSONObject2.getString("region")+" "+obj_JSONObject2.getString("country");
			double feelslike = obj_JSONObject1.getDouble("feelslike_c");
			String date_time = obj_JSONObject2.getString("localtime");
			System.out.println("temperature:"+temperature+"°C");
			System.out.println("temperature Real Feel:"+feelslike+"°C");
			
			
			System.out.println("location: "+location);
			
			Data product = new Data();
			product.setTemperature(temperature);
			product.setLocation(location);
			product.setFeelslike(feelslike);
			product.setDate_time(date_time);

			messageSender.sendMessage(product);
			System.out.println("Message has been sent successfully to Queue");

			context.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}

		
	}

}
