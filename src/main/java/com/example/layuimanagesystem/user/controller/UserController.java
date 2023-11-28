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
