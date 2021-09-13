package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/12 0012
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class user
{
    private int    id;
    private String name;
    private int    age;
}
