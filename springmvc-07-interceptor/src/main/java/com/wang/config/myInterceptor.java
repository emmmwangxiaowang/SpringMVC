package com.wang.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/24 0024
 */
public class myInterceptor implements HandlerInterceptor
{
    //return true ;执行下一个拦截器,放行
    //return false ;不执行下一个拦截器,放行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        System.out.println("===========处理前");
        return true;
    }

    //日志
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {
        System.out.println("=================处理后");

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {
        System.out.println("=======================清理");
    }
}
