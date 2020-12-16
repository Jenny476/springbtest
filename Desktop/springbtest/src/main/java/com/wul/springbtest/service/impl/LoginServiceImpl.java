package com.wul.springbtest.service.impl;

import com.wul.springbtest.enity.User;
import com.wul.springbtest.mapper.LoginMapper;
import com.wul.springbtest.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public User finduser(String username,String password) {
        return loginMapper.finduser(username,password);
    }
}
