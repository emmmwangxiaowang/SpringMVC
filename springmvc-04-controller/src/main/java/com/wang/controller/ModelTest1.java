package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/12 0012
 */

@Controller
public class ModelTest1
{

    @RequestMapping("/m1/t1")
    public String test1(Model model)
    {
        //重定向
        model.addAttribute("msg", "ModelTest1");

        //访问根目录下index.jsp文件。redirect为直接url 访问
        return "redirect:/index.jsp";
    }

    @RequestMapping("/m1/t2")
    public String test2(Model model)
    {
        //重定向
        model.addAttribute("msg", "ModelTest1");

        return "test";
    }
}
