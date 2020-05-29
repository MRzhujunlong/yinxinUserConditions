package com.yuanma.condition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuanma.condition.mapperif")
public class YinxinUserConditionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(YinxinUserConditionsApplication.class, args);
	}

}
