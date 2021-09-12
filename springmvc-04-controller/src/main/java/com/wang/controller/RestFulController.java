package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/12 0012
 */
@Controller
public class RestFulController
{

    //安全
    //原来的:  http://localhost:8080/add?a=1&b=2
    //RestFul: http://localhost:8080/add/a/b

    @RequestMapping(value = "/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model)
    {
        int res = a + b;
        model.addAttribute("msg", "requestMapping结果为:" + res);
        return "test";
    }

    @PostMapping(value = "/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model)
    {
        int res = a + b;
        model.addAttribute("msg", "postMapping结果为:" + res);
        return "test";
    }

    @GetMapping(value = "/add/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable int b, Model model)
    {
        int res = a + b;
        model.addAttribute("msg", "getMapping结果为:" + res);
        return "test";
    }
}
