package com.example.demo.clients;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ProductClient {
	
	@Autowired
	private RestTemplate template;
	
	private String url = "http://localhost:8080/products";
	
	public void getAll() {
		
		String resp=this.template.getForObject(this.url, String.class);
		System.out.print(resp);
	}
	

}
