package com.project.kayahotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.project.kayahotel.security",
		"com.project.kayahotel.service",
		"com.project.kayahotel.repository",
		"com.project.kayahotel.controller"})
public class KayaHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(KayaHotelApplication.class, args);
	}


}
