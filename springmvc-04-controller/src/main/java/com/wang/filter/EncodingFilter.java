package com.wang.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/12 0012
 */
public class EncodingFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy()
    {

    }
}
