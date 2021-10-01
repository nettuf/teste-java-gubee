package com.nettuf.gubeetest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nettuf.gubeetest.domain.Stack;

@Repository
public interface StackRepository extends MongoRepository<Stack, String>{

	
}