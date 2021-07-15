package com.springboot.soap;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoProjectApplication {

	static Logger logger=LoggerFactory.getLogger(JenkinsDemoProjectApplication.class);
	@PostConstruct
	public void intt()
	{
		logger.info("Logger Info...");
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoProjectApplication.class, args);
		System.out.println("Application Started");
		//logger.info("Logger Info...");
		logger.info("Application Executed...");
	}

}
