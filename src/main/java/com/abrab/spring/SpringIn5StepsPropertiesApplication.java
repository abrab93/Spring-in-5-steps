package com.abrab.spring;

import com.abrab.spring.properites.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);

    public static void main(String[] args) {

        try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            logger.info("{}--{}", someExternalService, someExternalService.getUrl());
            // or use applicationContext.close(); rather than resource try
        }
    }
}