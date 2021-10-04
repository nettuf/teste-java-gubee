package com.nettuf.gubeetest.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String productName;
	private String description;
	
	public Product() {
		
	}

	public Product(String productName, String description) {
		super();
		this.productName = productName;
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, productName);
	}

	
}
