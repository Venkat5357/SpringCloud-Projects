package com.practise.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProductMicroserviceApplication {

	@Value("${some.other.property}")
	private String someOtherProperty;

	@Autowired
	private ProductConfiguration properties;



	public static void main(String[] args) {
		SpringApplication.run(ProductMicroserviceApplication.class, args);
	}


	@RequestMapping("/")
	public String printValue() {

		StringBuilder sb = new StringBuilder();

		sb.append(properties.getProperty());
		sb.append("||");
		sb.append(someOtherProperty);

		return sb.toString();

	}
}
