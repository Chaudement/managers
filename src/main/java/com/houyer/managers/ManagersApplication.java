package com.houyer.managers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ManagersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagersApplication.class, args);
    }
}
