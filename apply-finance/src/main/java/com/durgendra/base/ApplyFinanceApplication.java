package com.durgendra.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplyFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplyFinanceApplication.class, args);
	}

}
