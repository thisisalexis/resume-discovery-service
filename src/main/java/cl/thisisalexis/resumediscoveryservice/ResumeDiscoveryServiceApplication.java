package cl.thisisalexis.resumediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ResumeDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeDiscoveryServiceApplication.class, args);
	}

}
