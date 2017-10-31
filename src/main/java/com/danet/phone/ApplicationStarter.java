package com.danet.phone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ApplicationStarter extends SpringBootServletInitializer {

	// @SpringBootApplication

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationStarter.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationStarter.class, args);
	}

}
