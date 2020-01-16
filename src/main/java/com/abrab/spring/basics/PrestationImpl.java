package com.abrab.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PrestationImpl {

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

}
