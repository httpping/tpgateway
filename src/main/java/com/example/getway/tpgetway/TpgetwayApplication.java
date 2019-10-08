package com.example.getway.tpgetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@EnableDiscoveryClient
@SpringBootApplication
public class TpgetwayApplication {

	public static void main(String[] args) {

		ExecutorService es = Executors.newCachedThreadPool();
		es.submit(null,null);
		SpringApplication.run(TpgetwayApplication.class, args);
	}

}
