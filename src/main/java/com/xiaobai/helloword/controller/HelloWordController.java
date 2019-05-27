package com.xiaobai.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: xiaobai
 * @Date: 2019/5/3 23:06
 * @email:
 * @address:
 * @Version 1.0
 */
@Controller
@RequestMapping("/")
public class HelloWordController {

    @ResponseBody
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHello(){
        return "helloWord";
    }
}
