package com.wul.springbtest.service;

import com.wul.springbtest.enity.User;

public interface LoginService {
    /**
     * 用户登录
     */
    User finduser(String username,String password);
}
