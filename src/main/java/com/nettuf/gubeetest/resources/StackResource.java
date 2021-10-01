package com.nettuf.gubeetest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nettuf.gubeetest.domain.Stack;
import com.nettuf.gubeetest.services.StackService;

@RestController
@RequestMapping(value = "/stacks")
public class StackResource {

	@Autowired
	private StackService service;
	
	@GetMapping
	public ResponseEntity<List<Stack>> findAll(){
		List<Stack> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
