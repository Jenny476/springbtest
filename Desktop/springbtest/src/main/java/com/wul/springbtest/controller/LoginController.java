package com.wul.springbtest.controller;

import com.wul.springbtest.enity.User;
import com.wul.springbtest.service.LoginService;
import com.wul.springbtest.service.impl.LoginServiceImpl;
import com.wul.springbtest.utils.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/index")
public class LoginController {
    @Autowired
    private LoginService ls;
    /**
     * 1、localhost:8080/index/login/path  get   @PathVariable String path    /login/{path}
     * 2、localhost:8080/index/login?id=12345&name=adada 均可   @RequestParam String id
     * 3、localhost:8080/index/login   @RequestBody   post
     *
     * @return
     */
    @PostMapping("/login")
    public User login(@RequestBody User user){
        User user1=ls.finduser(user.getUsername(),user.getPassword());
        if(ObjectUtils.isEmpty(user1)) {
            throw new ExceptionHandler("用户不存在或帐号密码错误");
        }
        return user1;
    }

}
