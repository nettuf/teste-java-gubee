package com.nettuf.gubeetest.services;

import java.util.List;
import java.util.Optional;

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
	
	public FinalProduct findById(String id) {
		Optional<FinalProduct> obj = repo.findById(id);
		return obj.orElseThrow(() -> new RuntimeException("Not found!"));
	}

	public FinalProduct insert(FinalProduct obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public FinalProduct update(FinalProduct obj) {
		FinalProduct newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(FinalProduct newObj, FinalProduct obj) {
		newObj.setProduct(obj.getProduct());
		newObj.setStack(obj.getStack());
		newObj.setTargetMarket(obj.getTargetMarket());
	}
	
	public List<FinalProduct> findByStack(String text){
		return repo.searchStack(text);
	}
	
	public List<FinalProduct> findByStack2(String text, String text2){
		return repo.searchStack2(text, text2);
	}
}
