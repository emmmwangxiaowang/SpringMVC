package com.wang.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/13 0013
 */
public class JsonUtils
{

    public static String getJson(Object object)
    {
        return getJson(object, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object object, String dateFormat)
    {
        ObjectMapper mapper = new ObjectMapper();

        //使用ObjectMapper来格式化输出  默认是使用时间戳
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);

        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(sdf);

        try
        {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e)
        {
            e.printStackTrace();

        }

        return null;
    }
}
