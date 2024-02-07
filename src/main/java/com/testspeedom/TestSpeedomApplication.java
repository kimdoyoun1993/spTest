package com.testspeedom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class TestSpeedomApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpeedomApplication.class, args);
	}

}
