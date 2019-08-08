//Configuration Metadata Class

package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Configuration Metadata Class

@Configuration
public class AppConfig {
	
	@Bean
	public Doctor doctor() {
		
		Doctor ramesh = new Doctor();
		ramesh.setDoctorId(420);
		ramesh.setDoctorName("Ramesh");
		ramesh.setPhoneNumber(969424266);
		ramesh.setAddress(address());
		return ramesh;
	}
	
	@Bean
	public Doctor surgeon() {
		
		Doctor suresh = new Doctor();
		suresh.setDoctorId(420);
		suresh.setDoctorName("Suresh");
		suresh.setPhoneNumber(969424266);
		
		return suresh;
	}
	
	@Bean
	public Address address() {
		return new Address("Gandhi Street","Chennai",600089);
	}
	

}
