package com.pyw.service;

import com.pyw.mappr.UserMapper;
import com.pyw.pojo.User;


public interface UserService {

    /**
     * 根据user信息去检查数据库是否存在用户
     *
     *
     */
    User get(User user);


}
