package com.atlas.prism.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication(scanBasePackages = "com.atlas.prism.config")
public class PrismApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrismApplication.class, args);
	}
}
