package com.example.layuimanagesystem.user.controller;

import com.example.layuimanagesystem.comment.vo.Result;
import com.example.layuimanagesystem.user.entity.User;
import com.example.layuimanagesystem.user.servive.UserService;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author MinZhi
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    /**
     * 登录验证
     * 1、先进行验证码验证
     * 2、从数据库中查找该用户信息并验证（service方法）
     *  -有，把用户信息存到session域，userInfo，并返回成功信息
     *  -没有，返回失败信息
     * @param parm 登录的用户信息
     * @param verCode 验证码信息
     * @param request
     * @param session
     * @return 验证信息，成功code=1，失败code=0
     */
    @RequestMapping("/login")
    public Result login(User parm, @RequestParam("captcha") String verCode, HttpServletRequest request, HttpSession session){

        //验证码验证
        if (!CaptchaUtil.ver(verCode, request)) {
//            CaptchaUtil.clear(request);  // 清除session中的验证码
            return Result.fail();
        }

        User user = userService.login(parm);
        if (user != null){
            user.setPassword(null);
            session.setAttribute("userInfo",user);
            return Result.successful();
        }
        return Result.fail();
    }
}
