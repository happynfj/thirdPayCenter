package com.example.serverproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServerProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProducerApplication.class, args);
	}


    @Value("${server.port}")
    public String port;

	@RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi"+name+"i am from port"+port;
    }
}
