package com.example.demo.controller;

import java.util.List;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Store;
import com.example.demo.services.StoreService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class StoreController {

	@Autowired
	private StoreService repo;
	
	@ApiOperation(value="Fetch the Details of All Global ")
	@ApiResponses({ @ApiResponse(code=200, message="Resource found - Success") })
	
	
	@GetMapping("/allStores")
	@Secured("ROLE_ADMIN")
//	@PermitAll
	public List<Store> getStore(){
		return this.repo.getAll();
		
	}
	
	@ApiParam(value="Enter 3 digit code")
	@GetMapping("/allStore/{storeId}")
	public Store findStoreById(@PathVariable("storeId") long id) {
		
		return this.repo.findById(id);
	}
}
