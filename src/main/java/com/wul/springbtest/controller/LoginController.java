package com.wul.springbtest.controller;

import com.wul.springbtest.enity.User;
import com.wul.springbtest.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping(value = "/index", produces = "application/json; charset=utf-8")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user, HttpServletRequest request) {
        return loginService.finduser(user,request);
    }
}
