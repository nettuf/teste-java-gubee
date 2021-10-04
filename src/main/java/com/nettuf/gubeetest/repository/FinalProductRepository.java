package com.nettuf.gubeetest.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.nettuf.gubeetest.domain.FinalProduct;

@Repository
public interface FinalProductRepository extends MongoRepository<FinalProduct, String>{

	@Query("{ 'stack.stack': { $regex: ?0, $options: 'i' } }")
	List<FinalProduct> searchStack(String obj);
	
	@Query("{'$or':[ {'stack.stack':?0 }, {'stack.stack':?1} ] }")
	List<FinalProduct> searchStack2(String obj1, String obj2);
	
}






//	@Query("{ $or: [ { 'stack.stack': { $regex: ?0, $options: 'i' }, { 'stack.stack': { $regex: ?0, $options: 'i' } ] }")
