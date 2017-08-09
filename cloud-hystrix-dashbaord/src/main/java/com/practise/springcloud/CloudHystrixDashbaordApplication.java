package com.practise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CloudHystrixDashbaordApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudHystrixDashbaordApplication.class, args);
	}
}
