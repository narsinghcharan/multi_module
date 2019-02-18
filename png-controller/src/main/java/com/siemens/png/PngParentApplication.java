package com.siemens.png;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.siemens.png.*"})
public class PngParentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PngParentApplication.class, args);
	}

}

