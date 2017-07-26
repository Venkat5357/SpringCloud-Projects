package com.practise.product.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by venkateshmarupudi on 7/25/17.
 */
@Component
@ConfigurationProperties(prefix = "some")
public class ProductConfiguration {

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    private String property;


}
