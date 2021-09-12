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

//只要实现了controller接口的类,说明这就是一个控制器了
public class ControllerTest01 implements Controller
{
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
    {

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "ControllerTest01");
        mv.setViewName("test");
        return mv;
    }
}
