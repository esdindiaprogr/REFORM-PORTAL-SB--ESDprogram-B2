package com.rpsb.ESD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication

public class RpsbApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RpsbApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RpsbApplication.class, args);
	}

}
