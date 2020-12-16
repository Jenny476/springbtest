package com.wul.springbtest.utils;

public class ExceptionHandler extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public static final ExceptionHandler LOGIN_ERROR = new ExceptionHandler("用户登录失败");

    public ExceptionHandler(String message) {
        super(message);
    }

    public ExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionHandler(Throwable cause) {
        super(cause);
    }
}
