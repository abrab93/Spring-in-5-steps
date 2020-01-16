package com.abrab.spring.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("cnops")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CnopsAssurance implements Assurance {

    public double getCouvertureMontant(double visitAmount) {
        System.out.println("Cnops calculations");
        return 0.7 * visitAmount;
    }
}
