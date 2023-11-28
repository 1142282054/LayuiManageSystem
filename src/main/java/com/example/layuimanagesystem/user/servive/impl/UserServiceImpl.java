package com.example.layuimanagesystem.user.servive.impl;

import com.example.layuimanagesystem.user.entity.User;
import com.example.layuimanagesystem.user.mapper.UserMapper;
import com.example.layuimanagesystem.user.servive.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    /**
     * 登录功能
     * 使用 SpringSecurity 进行加密验证
     * @param user 用户账号与密码信息
     * @return 用户详细信息，如果验证失败为null
     */
    @Override
    public User login(User user) {


        User mapperUser = userMapper.getUser(user);

        if (mapperUser != null &&
                passwordEncoder.matches(user.getPassword(), mapperUser.getPassword())) {
            return mapperUser;
        }
        return null;

    }
}
