package com.wul.springbtest.service;

import com.wul.springbtest.enity.User;
import com.wul.springbtest.mapper.LoginMapper;
import com.wul.springbtest.utils.ExceptionHandler;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.servlet.http.HttpServletRequest;

@Service
public class LoginService {
    private final LoginMapper loginMapper;

    public LoginService(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public User finduser(User user, HttpServletRequest request) {
        User exist = loginMapper.finduser(user);
        if (ObjectUtils.isEmpty(exist)) {
            throw ExceptionHandler.LOGIN_ERROR;
        }
        request.getSession().setAttribute("user", exist);
        return exist;
    }

    public User isLogin(HttpServletRequest request) {
        User login = (User) request.getSession().getAttribute("user");
        if (ObjectUtils.isEmpty(login)) {
            throw ExceptionHandler.NOT_LOGIN;
        }
        return login;
    }
}
