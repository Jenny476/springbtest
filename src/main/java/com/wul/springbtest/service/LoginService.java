package com.wul.springbtest.service;

import com.wul.springbtest.enity.User;
import com.wul.springbtest.mapper.LoginMapper;
import com.wul.springbtest.utils.ExceptionHandler;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class LoginService {
    private final LoginMapper loginMapper;

    public LoginService(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public User finduser(User user) {
        User exist = loginMapper.finduser(user);
        if (ObjectUtils.isEmpty(exist)) {
            throw ExceptionHandler.LOGIN_ERROR;
        }
        return exist;
    }
}
