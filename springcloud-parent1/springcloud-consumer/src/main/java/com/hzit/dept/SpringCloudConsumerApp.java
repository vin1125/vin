package com.hzit.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConsumerApp {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudConsumerApp.class, args);
	}

	
}
