package com.example.demo.servive.Impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.servive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @auther: asus
 * @date: 2020/6/4 14:55
 * @version: 1.0
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 查询用户表所有列名
     *
     * @return
     */
    @Override
    public List<String> selectAllRow() {
        return userMapper.selectAllRow();
    }

    @Override
    public List<Map<String,Object>> select(List<String> date) {
        return userMapper.select(date);
    }
}
