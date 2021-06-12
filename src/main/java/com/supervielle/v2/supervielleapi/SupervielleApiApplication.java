package com.supervielle.v2.supervielleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SupervielleApiApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(SupervielleApiApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SupervielleApiApplication.class, args);
	}

}
