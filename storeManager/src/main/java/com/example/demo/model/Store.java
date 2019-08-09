package com.example.demo.model;

import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Store {
	
	private long storeId;
	private String location;
	private String storeIncharge;
	private double yearlyTarget;
	


}
