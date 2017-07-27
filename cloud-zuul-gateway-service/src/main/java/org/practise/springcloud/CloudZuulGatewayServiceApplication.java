package org.practise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CloudZuulGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuulGatewayServiceApplication.class, args);
	}
}
