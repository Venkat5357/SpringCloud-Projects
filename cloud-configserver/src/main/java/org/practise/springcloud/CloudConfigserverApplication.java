package org.practise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigserverApplication.class, args);
	}
}
