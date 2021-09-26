package com.rara.Springf;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;

	public String getBrand() {
		return brand;
	 }
//constructor
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	@Override
	public String toString() {
		return "Tyre";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
