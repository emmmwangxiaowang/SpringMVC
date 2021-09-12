package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/12 0012
 */

@Controller
public class EncodingController
{

    //过滤器解决乱码
    @PostMapping("/e/t1")
    public String test1(String name, Model model)
    {
        model.addAttribute("msg", name);

        System.out.println(name);
        return "test";
    }
}
