package com.wang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wang.pojo.user;
import com.wang.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/13 0013
 */
@RestController //不同过视图解析器,直接返回字符串
//@Controller
public class userController
{

    @RequestMapping(value = "/j1")
    @ResponseBody  //不会走视图解析器,会直接返回一个字符串
    public String test1() throws JsonProcessingException
    {
        //jackson，objectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        user user = new user(1, "王小王", 20);

        String s = mapper.writeValueAsString(user);

        return s;
    }

    @RequestMapping(value = "/j2")
    @ResponseBody  //不会走视图解析器,会直接返回一个字符串
    public String test2() throws JsonProcessingException
    {
        //jackson，objectMapper
        //ObjectMapper mapper = new ObjectMapper();

        List <user> userList = new ArrayList <>();

        //创建一个对象
        user user  = new user(1, "王小王", 20);
        user user1 = new user(1, "王小王", 20);
        user user2 = new user(1, "王小王", 20);
        user user3 = new user(1, "王小王", 20);
        user user4 = new user(1, "王小王", 20);
        user user5 = new user(1, "王小王", 20);

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        //String s = mapper.writeValueAsString(userList);

        return JsonUtils.getJson(userList);
    }

    @RequestMapping(value = "/j3")
    @ResponseBody  //不会走视图解析器,会直接返回一个字符串
    public String test3() throws JsonProcessingException
    {
        Date date = new Date();

        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }

}
