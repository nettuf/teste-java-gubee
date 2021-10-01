package com.nettuf.gubeetest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nettuf.gubeetest.domain.TargetMarket;
import com.nettuf.gubeetest.repository.TargetMarketRepository;

@Service
public class TargetMarketService {
	
	@Autowired
	private TargetMarketRepository repo;
	
	public List<TargetMarket> findAll(){
		return repo.findAll();
	}

}
