package com.abrab.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CnssAssurance implements Assurance {

    public double getCouvertureMontant(double visitAmount) {
        System.out.println("Cnss calculations");
        return 0.3 * visitAmount;
    }
}
