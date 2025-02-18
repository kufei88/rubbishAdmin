package com.example.rubbish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author SpringBoot
 */
@SpringBootApplication
@MapperScan("com.example.rubbish.mapper")
public class RubbishAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubbishAdminApplication.class, args);
	}

}
