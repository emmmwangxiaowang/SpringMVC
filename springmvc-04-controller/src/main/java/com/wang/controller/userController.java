package com.wang.controller;

import com.wang.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/12 0012
 */

/**
 * LinkedHashMap
 * <p>
 * ModelMap: 继承了LinkedHashMap,所以拥有LinkedHashMap的所有功能！
 * <p>
 * Model: 精简版(大部分情况,我们都直接使用Model)
 * 只有几个方法  只适用于存储数据,简化了新手对Model对象的操作和理解
 * <p>
 * ModelAndView: 可以在存储数据的同时,可以进行设置返回的逻辑视图,进行控制展示层的跳转
 */

@Controller
@RequestMapping("/user")
public class userController
{
    //localhost:8080/user/t1?name=xxx;
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model)
    {
        //1.接收前端参数
        System.out.println("接收到前端的参数为:" + name);

        //2.将返回的结果传递给前端
        model.addAttribute("msg", name);

        //3.识图跳转
        return "test";
    }

    //前端接收的是一个对象: id,name,age

    /**
     * 1.接收前端用户传递的参数,判断参数的名字,假设名字直接在方法上,可以直接使用
     * 2.假设传递的是一个对象,匹配user对象中的字段名;如果名字一致则OK,否则匹配不到
     *
     * @param user
     * @return
     */
    @GetMapping("/t2")
    public String test2(user user)
    {

        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    public String test3(ModelMap map)
    {

        return "test";
    }
}
