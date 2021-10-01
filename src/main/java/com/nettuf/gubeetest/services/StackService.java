package com.nettuf.gubeetest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nettuf.gubeetest.domain.Stack;
import com.nettuf.gubeetest.repository.StackRepository;

@Service
public class StackService {
	
	@Autowired
	private StackRepository repo;
	
	public List<Stack> findAll(){
		return repo.findAll();
	}

}
