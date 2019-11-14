package com.pyw.service.impl;

import com.pyw.mappr.UserMapper;
import com.pyw.pojo.User;
import com.pyw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: pyw
 * @date: 2019-07-25 19:12
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    //注入mapper(通过SpringMvc注解引入dao接口)
    private UserMapper userMapper;

    @Override
    public User get(User user) {
        //提前检查
        if (user == null){
            return null;
        }
     return userMapper.query( user);
    }


}
