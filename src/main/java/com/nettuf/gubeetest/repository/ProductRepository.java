package com.nettuf.gubeetest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nettuf.gubeetest.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

	
}