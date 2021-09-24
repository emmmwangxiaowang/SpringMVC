package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/24 0024
 */
@Controller
@RequestMapping("/user")
public class loginController
{
    @RequestMapping("/main")
    public String main()
    {
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin()
    {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String userName, String password, Model model)
    {
        //吧用户的信息存在session中
        session.setAttribute("userLoginInfo", userName);
        model.addAttribute("userName", userName);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session)
    {
        session.removeAttribute("userLoginInfo");
        return "login";
        //return goLogin();
    }
}
