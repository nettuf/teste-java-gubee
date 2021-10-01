package com.nettuf.gubeetest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nettuf.gubeetest.domain.TargetMarket;

@Repository
public interface TargetMarketRepository extends MongoRepository<TargetMarket, String>{

	
}