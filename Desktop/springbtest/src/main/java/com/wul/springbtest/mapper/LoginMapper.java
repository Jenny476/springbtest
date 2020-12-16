package com.wul.springbtest.mapper;

import com.wul.springbtest.enity.User;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    User finduser( @Param("username") String username, @Param("password") String password);
}
