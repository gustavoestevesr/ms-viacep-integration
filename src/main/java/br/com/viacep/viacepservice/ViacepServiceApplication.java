package br.com.viacep.viacepservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ViacepServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViacepServiceApplication.class, args);
	}

}
