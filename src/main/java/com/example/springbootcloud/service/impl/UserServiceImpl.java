package com.example.springbootcloud.service.impl;

import com.example.springbootcloud.mapper.UserMapper;
import com.example.springbootcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserNo(String userNo) {

        return userMapper.getUserNo("0101110000057398");
    }
}
