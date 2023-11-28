package com.example.layuimanagesystem.comment.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MinZhi
 * @version 1.0
 */
@Controller
public class CommentController {

    @RequestMapping({"/login",})
    public String login(){
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}
