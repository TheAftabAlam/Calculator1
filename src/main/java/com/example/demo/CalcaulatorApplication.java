package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcaulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcaulatorApplication.class, args);
		Calculator calculator=new Calculator();
		calculator.Msg();
	}

}
