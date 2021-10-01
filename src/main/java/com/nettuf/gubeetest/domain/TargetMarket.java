package com.nettuf.gubeetest.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TargetMarket implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String targetMarket;
	
	public TargetMarket() {
		
	}

	public TargetMarket(String targetMarket) {
		super();
		this.targetMarket = targetMarket;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTargetMarket() {
		return targetMarket;
	}

	public void setTargetMarket(String targetMarket) {
		this.targetMarket = targetMarket;
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
		TargetMarket other = (TargetMarket) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
