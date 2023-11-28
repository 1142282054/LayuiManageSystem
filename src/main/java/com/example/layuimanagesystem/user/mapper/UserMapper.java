package com.example.layuimanagesystem.user.mapper;

import com.example.layuimanagesystem.user.entity.User;

/**
 * @author MinZhi
 * @version 1.0
 */
public interface UserMapper {

//    public User getUser(@Param("username")String username,@Param("password")String password);
    public User getUser(User user);

}
