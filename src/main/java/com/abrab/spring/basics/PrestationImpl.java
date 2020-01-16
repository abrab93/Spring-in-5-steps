package com.abrab.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PrestationImpl {

    private static Logger LOGGER = LoggerFactory.getLogger(PrestationImpl.class);

    @Autowired
    @Qualifier("cnops")
    private Assurance assurance;

//    public PrestationImpl(Assurance assurance) {
//        this.assurance = assurance;
//    }

    public double assuranceMaladieObligatoire(double visitAmount) {
        System.out.println(assurance);
        return this.assurance.getCouvertureMontant(visitAmount);
    }

    @PostConstruct
    public void postConstructMethod() {
        LOGGER.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroyMethod() {
        LOGGER.info("PreDestroy");
    }

}
