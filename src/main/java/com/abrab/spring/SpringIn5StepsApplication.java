package com.abrab.spring;

import com.abrab.spring.basics.PrestationImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

    public static void main(String[] args) {

        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class)) {
            PrestationImpl assurance = applicationContext.getBean(PrestationImpl.class);
            PrestationImpl assurance2 = applicationContext.getBean(PrestationImpl.class);
            logger.info("{}", assurance);
            logger.info("{}", assurance2);
            double result = assurance.assuranceMaladieObligatoire(100);
            double result2 = assurance2.assuranceMaladieObligatoire(100);
            logger.info("{}-{}", result, result2);
            // or use applicationContext.close(); rather than resource try
        }
    }
}