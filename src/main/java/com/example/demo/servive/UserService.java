package com.example.demo.servive;

import java.util.List;
import java.util.Map;

/**
 * @auther: asus
 * @date: 2020/6/4 14:55
 * @version: 1.0
 * @description:
 */
public interface UserService {

    /**
     * 查询用户表所有列名
     * @return
     */
    List<String> selectAllRow();

    List<Map<String,Object>> select(List<String> date);
}
