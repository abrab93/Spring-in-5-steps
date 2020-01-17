package com.abrab.spring.basics;

import com.abrab.spring.SpringIn5StepsApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(locations = "/applicationContext.xml")//Load the context
@ExtendWith(SpringExtension.class)
//to run test with spring
class PrestationXmlConfigurationTest {

    @Autowired
    private PrestationImpl prestation;

    @Test
    void testPrestationTest() {
        assertEquals(10 * 0.7, prestation.assuranceMaladieObligatoire(10));
    }
}