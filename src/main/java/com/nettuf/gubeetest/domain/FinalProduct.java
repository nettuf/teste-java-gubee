package com.nettuf.gubeetest.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FinalProduct implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Product product;
	
	private List<TargetMarket> targetMarket = new ArrayList<TargetMarket>();
	
	private List<Stack> stack = new ArrayList<Stack>();
	
	public FinalProduct() {
		
	}

	public FinalProduct(Product product) {
		super();
		this.product = product;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<TargetMarket> getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(List<TargetMarket> targetMarket) {
		this.targetMarket = targetMarket;
	}

	public List<Stack> getStack() {
		return stack;
	}

	public void setStack(List<Stack> stack) {
		this.stack = stack;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FinalProduct other = (FinalProduct) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
