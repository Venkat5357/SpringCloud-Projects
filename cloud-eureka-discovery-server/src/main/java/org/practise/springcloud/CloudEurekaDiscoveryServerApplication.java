package org.practise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaDiscoveryServerApplication.class, args);
	}
}
