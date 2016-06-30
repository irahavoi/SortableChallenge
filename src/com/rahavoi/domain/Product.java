package com.rahavoi.domain;

public class Product {
	private String productName;
	private String manufacturer;
	private String model;
	private String family;
	
	public Product(){}
	
	public Product(String productName, String manufacturer, String model, String family) {
		super();
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.model = model;
		this.family = family;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	
}
