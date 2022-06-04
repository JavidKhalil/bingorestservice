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

        // her gun seher 5 int random olaraq veren bir dene xidmet duzelt

        // domain design

        // random number

        // localhost: 9001 9002 9003 // rest / v1 /

        // localhost:9001/rest/v1 GET

        // 5 int cavab json

        SpringApplication.run(RestfirstApplication.class, args);

    }

}
