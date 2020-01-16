package com.abrab.spring;

import com.abrab.spring.basics.PrestationImpl;
import com.abrab.spring.xml.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {

        try (ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);

            logger.info("{} - {}", xmlPersonDao, xmlPersonDao.getXmlJdbcConnector());
            // or use applicationContext.close(); rather than resource try
        }
    }

}
