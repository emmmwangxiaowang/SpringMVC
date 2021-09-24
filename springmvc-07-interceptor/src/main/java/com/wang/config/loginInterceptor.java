package com.wang.config;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/24 0024
 */
public class loginInterceptor implements HandlerInterceptor
{

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        // 放行:判断什么情况下登录

        //登录页面也放行
        if (request.getRequestURI().contains("Login"))
        {
            return true;
        }

        if (request.getSession().getAttribute("userLoginInfo") != null)
        {
            //放行
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
