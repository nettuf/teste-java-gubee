package com.nettuf.gubeetest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nettuf.gubeetest.domain.FinalProduct;
import com.nettuf.gubeetest.repository.FinalProductRepository;

@Service
public class FinalProductService {
	
	@Autowired
	private FinalProductRepository repo;
	
	public List<FinalProduct> findAll(){
		return repo.findAll();
	}

}
