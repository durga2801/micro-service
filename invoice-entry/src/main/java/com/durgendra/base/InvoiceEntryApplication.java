package com.durgendra.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InvoiceEntryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceEntryApplication.class, args);
	}

}
