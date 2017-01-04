package com.news.service.impl;

import com.news.bean.User;
import com.news.dao.UserMapper;
import com.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/1/4.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByName(String name) {
        User user = userMapper.selectByName(name);
        return user;
    }


}
