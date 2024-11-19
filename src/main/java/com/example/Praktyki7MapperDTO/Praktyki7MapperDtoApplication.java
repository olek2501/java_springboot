package com.example.Praktyki7MapperDTO;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Praktyki7MapperDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Praktyki7MapperDtoApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
