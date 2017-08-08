package org.practise.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration
public class CloudZuulGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuulGatewayServiceApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter(){

		return new SimpleFilter();
	}
}
