package com.example.demo.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

//This is controller that wont send the view but it will return the response body
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class ProductController {
	
@Autowired
List<Product> productList;

	@GetMapping("/products")
	public List<Product> getProducts(){
		return productList;
	}
	
	
	private Product filterProductById(Long pid) {
		return this.productList.stream().
				filter(eachProduct -> eachProduct.getProductId()==pid).
				findFirst().orElse(null);
		
	}
	
	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable("id") long pid) {
		
		return filterProductById(pid);
		
	}
	
	@PostMapping(value="/products",consumes="application/json",produces="application/json")
	public Product addProduct(@RequestBody Product product) {
		
			this.productList.add(product);
			return product;
		
	}

	@PutMapping(value="/products",consumes="application/json",produces="application/json")
	public Product updateProduct(@RequestBody Product product) {
	
		long pid=product.getProductId();
		
		Product productToUpdate=filterProductById(pid);
		if(productToUpdate!=null) {
			productToUpdate.setProductId(product.getProductId());
			productToUpdate.setProductName(product.getProductName());
			productToUpdate.setPrice(product.getPrice());
			productToUpdate.setRating(product.getRating());
			productToUpdate.setRefImage(product.getRefImage());
		}
		return productToUpdate;
		
		
	}
	
	@DeleteMapping(value="/products",consumes="application/json",produces="application/json")
	public Product removeProduct(@RequestBody Product product) {
		Product productToDelete=filterProductById(product.getProductId());
		
		if(productToDelete!=null)		{
			this.productList.remove(productToDelete);
		}
		return productToDelete;
	}
	
}
