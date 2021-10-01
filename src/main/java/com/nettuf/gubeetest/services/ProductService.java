package com.nettuf.gubeetest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nettuf.gubeetest.domain.Product;
import com.nettuf.gubeetest.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> findAll(){
		return repo.findAll();
	}

}
