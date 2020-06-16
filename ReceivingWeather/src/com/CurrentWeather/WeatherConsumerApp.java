package com.CurrentWeather;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class WeatherConsumerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		try
		{
			Thread.sleep(6000000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		context.close();
	}

}
