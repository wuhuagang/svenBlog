package com.steve.web.entity;

import java.util.UUID;

/**
 * @author wuhuagang
 * @date 2019/1/5
 * @desc
 */
public class User extends BaseDto{
    private static final long serialVersionUID = 5091332702653344776L;
    private String userId = UUID.randomUUID().toString();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
