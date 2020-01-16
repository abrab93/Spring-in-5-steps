package com.abrab.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

    @Autowired
    private JdbcConnector jdbcConnector;

    public JdbcConnector getJdbcConnector() {
        return jdbcConnector;
    }
}
