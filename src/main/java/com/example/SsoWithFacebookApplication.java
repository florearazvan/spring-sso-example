package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SsoWithFacebookApplication {

    /**
     * Single sign on app using facebook and github.
     * Reference => https://spring.io/guides/tutorials/spring-boot-oauth2/
     **/
    public static void main(String[] args) {
		SpringApplication.run(SsoWithFacebookApplication.class, args);
	}
}
