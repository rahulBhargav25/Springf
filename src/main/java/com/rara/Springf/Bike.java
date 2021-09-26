package com.rara.Springf;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	public void drive() 
	{
		System.out.println("Bhagg raha hai");
	}
}
