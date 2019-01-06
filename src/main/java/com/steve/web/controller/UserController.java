package com.steve.web.controller;

import com.steve.web.entity.User;
import com.steve.web.result.Result;
import com.steve.web.result.ResultGenerate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * restful风格的controller测试
 * @author wuhuagang
 * @date 2019/1/5
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/getUser.json")
    public Result getUserById(String userId){
        logger.info("接收到请求");
        return ResultGenerate.generateSuccess(new User());
    }

}
