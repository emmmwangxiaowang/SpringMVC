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
@RequestMapping("t3")
public class ControllerTest03
{

    @RequestMapping("t3")
    public String test1(Model model)
    {

        model.addAttribute("msg", "ControllerTest03");
        return "test";
    }
}
