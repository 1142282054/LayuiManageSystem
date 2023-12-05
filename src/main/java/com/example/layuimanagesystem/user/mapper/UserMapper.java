package com.example.layuimanagesystem.user.mapper;

import com.example.layuimanagesystem.user.entity.User;

/**
 * @author MinZhi
 * @version 1.0
 */
public interface UserMapper {

//    public User getUser(@Param("username")String username,@Param("password")String password);

    /**
     * 根据登录名获取用户信息
     * @param user 用户信息
     * @return 用户信息
     */
    public User getUser(User user);

}
