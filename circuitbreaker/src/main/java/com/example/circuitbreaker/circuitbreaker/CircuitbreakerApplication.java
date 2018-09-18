package com.example.circuitbreaker.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RestController;

@EnableHystrixDashboard
@SpringBootApplication
@EnableCircuitBreaker
public class CircuitbreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}
}
