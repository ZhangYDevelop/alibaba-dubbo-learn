package com.zy.alibaba.author.mapper;

import com.zy.alibaba.author.support.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where username = #{username}")
    User getUserByUserName(@Param("username") String username);
}
