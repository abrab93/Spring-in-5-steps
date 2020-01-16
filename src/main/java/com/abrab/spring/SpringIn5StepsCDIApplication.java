package com.abrab.spring;

import com.abrab.spring.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class);

        SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{}", someCdiBusiness);

    }

}
