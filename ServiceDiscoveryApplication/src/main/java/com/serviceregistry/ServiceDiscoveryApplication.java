/*
 * This class represents the Service Discovery application, which is responsible for registering and discovering microservices in the system.
 */
package com.serviceregistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * Main class to start the Service Discovery application.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApplication {
    /*
     * Main method to start the Service Discovery application.
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryApplication.class, args);
    }
}
