package com.tchelo.eureka_server_ticket241;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTicket241Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTicket241Application.class, args);
	}

}
