package com.wang.controller;

import com.wang.pojo.user;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/19 0019
 */
@RestController
public class ajaxController
{
    @RequestMapping("/t1")
    public String test()
    {
        return "hello ";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse res) throws IOException
    {
        System.out.println("a1:param = " + name);
        if ("wang".equals(name))
        {
            res.getWriter().println("true");
        } else
        {
            res.getWriter().println("false");
        }
    }

    @RequestMapping("/a2")
    public List <user> a2()
    {
        List <user> userList = new ArrayList <>();
        //添加数据
        userList.add(new user("王小王", 20, "男"));
        userList.add(new user("李李李", 20, "女"));
        userList.add(new user("emmm", 20, "男"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd)
    {
        String msg = "";
        if (name != null)
        {
            System.out.println("=====================");
            System.out.println(name);
            if ("admin".equals(name))
            {
                msg = "ok";
            } else
            {
                msg = "用户名有误";
            }
        }
        if (pwd != null)
        {
            System.out.println("===============");
            System.out.println(pwd);
            if ("123456".equals(pwd))
            {
                msg = "ok";
            } else
            {
                msg = "密码错误";
            }
        }
        return msg;
    }
}
