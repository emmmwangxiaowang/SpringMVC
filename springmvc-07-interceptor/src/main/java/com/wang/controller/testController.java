package com.wang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/24 0024
 */

@RestController
public class testController
{
    @GetMapping("/t1")
    public String test()
    {
        System.out.println("testController===test()方法执行了");
        return "ok";

    }
}
