package com.wokercompras;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class WokercomprasApplication {

	public static void main(String[] args) {
		SpringApplication.run(WokercomprasApplication.class, args);
	}
}
