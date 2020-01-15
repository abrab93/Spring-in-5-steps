package com.abrab.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
        PrestationImpl assurance = applicationContext.getBean(PrestationImpl.class);
        double result = assurance.assuranceMaladieObligatoire(100);
        System.out.println(result);
    }

}
