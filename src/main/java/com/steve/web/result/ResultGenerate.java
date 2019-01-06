package com.steve.web.result;

import com.steve.constant.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * @author wuhuagang
 * @date 2019/1/6
 * @desc
 */
public class ResultGenerate {
    public static Result generateSuccess(Object data){
        return new Result(HttpStatus.OK,data);
    }
    public static Result generateFailure(Object data){
        return new Result(HttpStatus.BAD_REQUEST,data);
    }

    public static Result generateFailure(ResponseStatus status){
        return new Result(status);
    }
}
