package com.abrab.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CnopsAssurance implements Assurance {

    public double getCouvertureMontant(double visitAmount) {
        System.out.println("Cnops calculations");
        return 0.7 * visitAmount;
    }
}
