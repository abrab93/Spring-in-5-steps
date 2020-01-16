package com.abrab.spring;

import com.abrab.spring.basics.PrestationImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class)) {
            PrestationImpl assurance = applicationContext.getBean(PrestationImpl.class);
            PrestationImpl assurance2 = applicationContext.getBean(PrestationImpl.class);
            System.out.println(assurance);
            System.out.println(assurance2);
            double result = assurance.assuranceMaladieObligatoire(100);
            result = assurance2.assuranceMaladieObligatoire(100);
            System.out.println(result);

            // or use applicationContext.close(); rather than resource try
        }
    }

}
