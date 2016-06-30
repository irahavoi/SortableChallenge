package com.rahavoi.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rahavoi.domain.Product;

public class ProductHandler implements TextFileHandler{
	public static final String PRODUCT_NAME = "product_name";
	public static final String MANUFACTURER = "manufacturer";
	public static final String MODEL = "model";
	public static final String FAMILY = "family";
	
	private List<Product> products = new ArrayList<>();

	@Override
	public void handleTextLine(String textLine) {
		Product product = new Product();
		JsonObject json = new JsonParser().parse(textLine).getAsJsonObject();
		product.setProductName(json.get(PRODUCT_NAME).getAsString());
		product.setManufacturer(json.get(MANUFACTURER).getAsString());
		product.setModel(json.get(MODEL).getAsString());
		
		JsonElement familyJson = json.get(FAMILY);
		product.setFamily(familyJson != null ? familyJson.getAs);
		
		products.add(product);
		
		System.out.println(textLine);
		
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
