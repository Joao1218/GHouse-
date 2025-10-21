package com.GHouseApi.GHouseApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GHouseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GHouseApiApplication.class, args);
	}

}
