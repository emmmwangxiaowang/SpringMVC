package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/11 0011
 */

//代表这个类会被Spring接管,被这个注解的类,里面所有的方法
//如果返回值是String, 并且有具体页面,呢么就会被视图解析器解析
@Controller
public class ControllerTest02
{
    @RequestMapping("/t2")
    public String test2(Model model)
    {
        model.addAttribute("msg", "ControllerTest02");

        return "test";
    }

    @RequestMapping("/t1")
    public String test1(Model model)
    {
        model.addAttribute("msg", "ControllerTest01");

        return "test";
    }

    @RequestMapping("/t3")
    public String test3(Model model)
    {
        model.addAttribute("msg", "ControllerTest02");

        return "test";
    }
}
