package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/11 0011
 */

@Controller
public class HelloController
{
    @RequestMapping("/hello")
    public String hello(Model model)
    {
        //封装数据
        model.addAttribute("msg", "hello ,SpringMVCAnnotation");
        return "hello"; //会被视图解析器处理

    }
}
