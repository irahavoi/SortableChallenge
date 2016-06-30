package com.rahavoi.util;

import java.util.List;

import com.rahavoi.domain.Product;

public class ProductHandler implements TextFileHandler{
	private List<Product> products;

	@Override
	public void handleTextLine(String textLine) {
		System.out.println(textLine);
		
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
