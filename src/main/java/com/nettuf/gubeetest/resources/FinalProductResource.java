package com.nettuf.gubeetest.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<FinalProduct> findById(@PathVariable String id){
		FinalProduct obj = service.findById(id);
		return ResponseEntity.ok().body((obj));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody FinalProduct obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> update(@RequestBody FinalProduct obj, @PathVariable String id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping(value = "/stacksearch")
	public ResponseEntity<List<FinalProduct>> findByStack(@RequestParam(value = "text", defaultValue = "") String text){
		List<FinalProduct> list = service.findByStack(text);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/stacksearch2")
	public ResponseEntity<List<FinalProduct>> findByStack2(@RequestParam(value = "text") String text, @RequestParam(value = "text2") String text2){
		List<FinalProduct> list = service.findByStack2(text, text2);
		return ResponseEntity.ok().body(list);
	}
	
	
	
}
