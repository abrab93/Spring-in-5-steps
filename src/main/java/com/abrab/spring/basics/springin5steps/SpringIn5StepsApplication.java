package com.abrab.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
        PrestationImpl assurance = applicationContext.getBean(PrestationImpl.class);
        PrestationImpl assurance2 = applicationContext.getBean(PrestationImpl.class);
        System.out.println(assurance);
        System.out.println(assurance2);
        double result = assurance.assuranceMaladieObligatoire(100);
        result = assurance2.assuranceMaladieObligatoire(100);
        System.out.println(result);
    }

}
