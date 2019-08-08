package com.example.demo;

import javax.xml.ws.RespectBinding;

import org.springframework.web.bind.annotation.GetMapping;

@RespectBinding
public class DoctorRepo {
	@GetMapping("/emp")
	public EmployeeRepo getEmployee() {		
	
		
		return new EmployeeRepo(101,"Ramesh");
	}

}
