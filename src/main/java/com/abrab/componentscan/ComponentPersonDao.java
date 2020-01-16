package com.abrab.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDao {

    @Autowired
    private ComponentJdbcConnector componentJdbcConnector;

    public ComponentJdbcConnector getComponentJdbcConnector() {
        return componentJdbcConnector;
    }
}
