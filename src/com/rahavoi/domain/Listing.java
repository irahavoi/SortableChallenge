package com.rahavoi.domain;

public class Listing {
	private String title;
	private String manufacturer;

	public Listing(String title, String manufacturer) {
		super();
		this.title = title;
		this.manufacturer = manufacturer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
