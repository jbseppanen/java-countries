package com.lambdaschool.javacountries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebCountriesApplication {

    static CountryList list;

    public static void main(String[] args) {
        list = new CountryList();
        SpringApplication.run(WebCountriesApplication.class, args);
    }

}

