package com.nettuf.gubeetest.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TargetMarket implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String targetMarket;
	
	public TargetMarket() {
		
	}

	public TargetMarket(String targetMarket) {
		super();
		this.targetMarket = targetMarket;
	}


	public String getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(String targetMarket) {
		this.targetMarket = targetMarket;
	}

	
}
