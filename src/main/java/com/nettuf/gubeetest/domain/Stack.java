package com.nettuf.gubeetest.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stack implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String stack;
	
	public Stack() {
		
	}

	public Stack(String stack) {
		super();
		this.stack = stack;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
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
		Stack other = (Stack) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
