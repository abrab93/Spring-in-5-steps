package com.abrab.spring;

import com.abrab.spring.basics.PrestationImpl;
import com.abrab.spring.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
        PersonDao personDao = applicationContext.getBean(PersonDao.class);
        PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnector());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnector());

    }

}
