package com.wul.springbtest.mapper;

import com.wul.springbtest.enity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    User finduser(User user);
}
