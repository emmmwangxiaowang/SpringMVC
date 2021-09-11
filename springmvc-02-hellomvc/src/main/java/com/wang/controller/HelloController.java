package com.wang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/11 0011
 */
public class HelloController implements Controller
{
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
    {
        ModelAndView modelAndView = new ModelAndView();

        //业务代码
        String result = " hello springMVC ";

        modelAndView.addObject("msg", result);

        //视图跳转
        modelAndView.setViewName("test");
        return modelAndView;

    }
}
