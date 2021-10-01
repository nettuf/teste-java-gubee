package com.nettuf.gubeetest.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nettuf.gubeetest.domain.Product;
import com.nettuf.gubeetest.repository.ProductRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {

		productRepository.deleteAll();
		
		Product p1 = new Product("Gubee Integrador","Ferramenta de integração para marketplaces");
		Product p2 = new Product("Gubee Fretes", "Ferramenta para gestão e calculo de fretes");
		Product p3 = new Product("Gubee AntiFraude", "Ferramenta especialistas em detecção e prevenção à fraude");
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
	}

}
