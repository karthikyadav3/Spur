package com.spur.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.spur.controller", "com.spur.service", "com.spur.model"})
@EnableAutoConfiguration
@SpringBootApplication
public class SpurApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpurApplication.class, args);
	}
	

}
