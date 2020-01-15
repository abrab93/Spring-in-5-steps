package com.abrab.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrestationImpl {

    @Autowired
    private Assurance assurance;

//    public PrestationImpl(Assurance assurance) {
//        this.assurance = assurance;
//    }

    public double assuranceMaladieObligatoire(double visitAmount) {

        CnssAssurance cnssAssurance = new CnssAssurance();

        return this.assurance.getCouvertureMontant(visitAmount);
    }

}
