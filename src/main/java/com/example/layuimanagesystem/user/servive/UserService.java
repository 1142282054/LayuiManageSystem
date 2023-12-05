package com.example.layuimanagesystem.user.servive;

import com.example.layuimanagesystem.user.entity.User;

public interface UserService {

    /**
     * 登录验证
     * @param user 用户信息
     * @return 成功返回用户信息,失败为null
     */
    public User login(User user);

}
