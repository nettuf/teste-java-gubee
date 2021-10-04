package com.nettuf.gubeetest.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stack implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String stack;
	
	public Stack() {
		
	}

	public Stack(String stack) {
		super();
		this.stack = stack;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}


}
