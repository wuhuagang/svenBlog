package com.steve.web.result;

import com.steve.constant.ResponseStatus;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 统一封装的restful风格响应实体类
 * @author wuhuagang
 * @date 2019/1/6
 * @desc
 */
public class Result implements Serializable {

    private static SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
    private static final long serialVersionUID = 4055544165183732218L;
    private int code;
    private String msg;
    private Object data;
    private String current = format.format(new Date());

    public Result() {
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(HttpStatus httpStatus, Object data) {
        this(httpStatus.value(),httpStatus.getReasonPhrase(),data);
    }

    public Result(ResponseStatus status) {
        this.msg = status.getMsg();
        this.code = status.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}
