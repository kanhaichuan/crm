package com.example.crm.service.impl;

import com.example.crm.dao.UserMapper;
import com.example.crm.model.User;
import com.example.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @date:2019/5/20
 * @author:felix
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.selectByLoginActAndLoginPwd(user);
    }
}
