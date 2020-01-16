package com.abrab.spring;

import com.abrab.componentscan.ComponentPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.abrab.componentscan")
public class SpringIn5StepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
        ComponentPersonDao componentPersonDao = applicationContext.getBean(ComponentPersonDao.class);
        ComponentPersonDao componentPersonDao2 = applicationContext.getBean(ComponentPersonDao.class);

        LOGGER.info("{}", componentPersonDao);
        LOGGER.info("{}", componentPersonDao.getComponentJdbcConnector());

        LOGGER.info("{}", componentPersonDao2);
        LOGGER.info("{}", componentPersonDao2.getComponentJdbcConnector());

    }

}
