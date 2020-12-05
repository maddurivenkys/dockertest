package com.venkys.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class DockerTestSprintBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestSprintBootApplication.class, args);
	}
	
	@RequestMapping("/")
    public String home() {
        return "Hello World Spring Boot!";
    }

}
