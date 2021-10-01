package com.nettuf.gubeetest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nettuf.gubeetest.domain.TargetMarket;
import com.nettuf.gubeetest.services.TargetMarketService;

@RestController
@RequestMapping(value = "/targets")
public class TargetMarketResource {

	@Autowired
	private TargetMarketService service;
	
	@GetMapping
	public ResponseEntity<List<TargetMarket>> findAll(){
		List<TargetMarket> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
