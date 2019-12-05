package com.test.readlist.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author wangdk, wangdk@erongdu.com
 * @CreatTime 2019/8/9 14:36
 * @Since version 1.0.0
 */
@Component
@ConfigurationProperties(prefix="amazon")
public class AmazonProperties {
    private String associateId;


    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }
}
