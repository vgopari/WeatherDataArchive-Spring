package com.CurrentWeather;


import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;



@Component
public class WeatherReceiver implements MessageListener
{
	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	MessageConverter messageConverter;

	public void onMessage(Message message)
	{
		try
		{
			Data data = (Data) messageConverter.fromMessage(message);

			System.out.println("------- Retrieved from queue -------");
			System.out.println(data);
			System.out.println("------- Retrieved from queue -------");
		}
		catch (JMSException e)
		{
			e.printStackTrace();
		}

	}
}
