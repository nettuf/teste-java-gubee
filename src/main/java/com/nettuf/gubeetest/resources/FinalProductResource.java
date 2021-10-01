package com.nettuf.gubeetest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nettuf.gubeetest.domain.FinalProduct;
import com.nettuf.gubeetest.services.FinalProductService;

@RestController
@RequestMapping(value = "/finals")
public class FinalProductResource {

	@Autowired
	private FinalProductService service;
	
	@GetMapping
	public ResponseEntity<List<FinalProduct>> findAll(){
		List<FinalProduct> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
