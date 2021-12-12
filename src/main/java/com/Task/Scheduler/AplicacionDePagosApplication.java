package com.Task.Scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class AplicacionDePagosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionDePagosApplication.class, args);
	}

}
