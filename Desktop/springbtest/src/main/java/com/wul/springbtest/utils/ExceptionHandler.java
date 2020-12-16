package com.wul.springbtest.utils;

public class ExceptionHandler extends RuntimeException{
    public ExceptionHandler(String msg){
        super(msg);
    }
    public ExceptionHandler(String msg,Throwable cause){
        super(msg,cause);
    }
    public ExceptionHandler(Throwable cause){
        super(cause);
    }
}
