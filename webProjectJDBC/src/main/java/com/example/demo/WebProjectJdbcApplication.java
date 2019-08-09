package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@SpringBootApplication
public class WebProjectJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(WebProjectJdbcApplication.class, args);
		PaymentService service = ctx.getBean(PaymentService.class);
		
		Payment pmt = ctx.getBean(Payment.class);
		
		pmt.setCustomerName("Ramesh");
		pmt.setTxnId(101);
		pmt.setTxnAmount(20000.00D);
		
		service.save(pmt);
	}

}
