package com.nettuf.gubeetest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nettuf.gubeetest.domain.FinalProduct;

@Repository
public interface FinalProductRepository extends MongoRepository<FinalProduct, String>{

	
}