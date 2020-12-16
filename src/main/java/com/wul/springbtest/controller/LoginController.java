package com.wul.springbtest.controller;

import com.wul.springbtest.enity.User;
import com.wul.springbtest.service.LoginService;
import com.wul.springbtest.utils.ExceptionHandler;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 *
 * 这是我改的东西
 */
@RestController
@RequestMapping(value = "/index", produces = "application/json; charset=utf-8")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return loginService.finduser(user);
    }

}
