package com.nettuf.gubeetest.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nettuf.gubeetest.domain.FinalProduct;
import com.nettuf.gubeetest.domain.Product;
import com.nettuf.gubeetest.domain.Stack;
import com.nettuf.gubeetest.domain.TargetMarket;
import com.nettuf.gubeetest.repository.FinalProductRepository;
import com.nettuf.gubeetest.repository.ProductRepository;
import com.nettuf.gubeetest.repository.StackRepository;
import com.nettuf.gubeetest.repository.TargetMarketRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private TargetMarketRepository targetMarketRepository;
	
	@Autowired
	private StackRepository stackRepository;
	
	@Autowired
	private FinalProductRepository finalRepository;
	
	@Override
	public void run(String... args) throws Exception {

		productRepository.deleteAll();
		
		Product p1 = new Product("Gubee Integrador","Ferramenta de integração para marketplaces");
		Product p2 = new Product("Gubee Fretes", "Ferramenta para gestão e calculo de fretes");
		Product p3 = new Product("Gubee AntiFraude", "Ferramenta especialistas em detecção e prevenção à fraude");
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		targetMarketRepository.deleteAll();
		
		TargetMarket t1 = new TargetMarket("Ecommerce");
		TargetMarket t2 = new TargetMarket("ERP");
		TargetMarket t3 = new TargetMarket("Lojista que não desejam possuir ecommerce");
		TargetMarket t4 = new TargetMarket("Loja fisica");
		TargetMarket t5 = new TargetMarket("Telecom");
		TargetMarket t6 = new TargetMarket("Venda direta");
		TargetMarket t7 = new TargetMarket("Mobile first");
		TargetMarket t8 = new TargetMarket("Digital Onboarding");
		
		targetMarketRepository.saveAll(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8));
		
		stackRepository.deleteAll();
		
		Stack s1 = new Stack("Java 10");
		Stack s2 = new Stack("Kotlin");
		Stack s3 = new Stack("Kafka");
		Stack s4 = new Stack("Event Stream");
		Stack s5 = new Stack("Redis");
		Stack s6 = new Stack("MongoDB");
		Stack s7 = new Stack("NodeJS");
		Stack s8 = new Stack("Big Data Analytics");
		Stack s9 = new Stack("Hadoop");
		Stack s10 = new Stack("Pig");
		Stack s11 = new Stack("Cassandra");
		
		stackRepository.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11));
		
		finalRepository.deleteAll();
		
		FinalProduct f1 = new FinalProduct(p1);
		f1.setTargetMarket(Arrays.asList(t1,t2,t3));
		f1.setStack(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		FinalProduct f2 = new FinalProduct(p2);
		f2.setTargetMarket(Arrays.asList(t1,t2,t4));
		f2.setStack(Arrays.asList(s6,s7));
		
		FinalProduct f3 = new FinalProduct(p3);
		f3.setTargetMarket(Arrays.asList(t1,t5,t6,t7,t8));
		f3.setStack(Arrays.asList(s8,s9,s3,s10,s11));
		
		finalRepository.saveAll(Arrays.asList(f1,f2,f3));
		
		
	}

}
