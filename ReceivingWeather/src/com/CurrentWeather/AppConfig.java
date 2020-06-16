package com.CurrentWeather;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.CurrentWeather")
@Import({ MessagingConfiguration.class })
public class AppConfig
{

	// Put Other Application configuration here.
}
