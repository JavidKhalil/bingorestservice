package com.nebidesign.restfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.nebidesign.*")
@EntityScan("com.nebidesign.*")
public class RestfirstApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestfirstApplication.class, args);

    }

}
