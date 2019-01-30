package com.study.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication()
@ComponentScan("com.study.pontointeligente.api")
public class PontoInteligenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}

}


