package com.steve.constant;

/**
 * @author wuhuagang
 * @date 2019/1/6
 * @desc
 */
public enum ResponseStatus {

    DEFAULT(200,"OK"),

    METHON_ERROR(101,"请求Method error");

    private int code;
    private String msg;
    ResponseStatus(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
