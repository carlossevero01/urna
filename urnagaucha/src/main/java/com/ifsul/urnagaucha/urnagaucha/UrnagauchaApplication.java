package com.ifsul.urnagaucha.urnagaucha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) //excluir temporariamente a segurança de login
public class UrnagauchaApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(UrnagauchaApplication.class, args);
	}

	

}
