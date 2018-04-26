package com.yada.mis.ars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ArsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArsApplication.class, args);
	}
}
