package com.example.springbootpropertysample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GreetingConfig.class)
public class SpringBootPropertySampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertySampleApplication.class, args);
	}

}
