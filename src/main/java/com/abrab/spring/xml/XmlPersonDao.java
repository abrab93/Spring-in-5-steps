package com.abrab.spring.xml;

public class XmlPersonDao {

    private XmlJdbcConnector xmlJdbcConnector;

    public XmlJdbcConnector getXmlJdbcConnector() {
        return xmlJdbcConnector;
    }

    public void setXmlJdbcConnector(XmlJdbcConnector xmlJdbcConnector) {
        this.xmlJdbcConnector = xmlJdbcConnector;
    }
}
