package com.steve.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * jsp-servlet测试controller，详情见jsp-servlet的视图解析器配置
 * @author wuhuagang
 * @date 2019/1/6
 * @desc
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }
}
