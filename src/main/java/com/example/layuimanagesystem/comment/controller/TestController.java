package com.example.layuimanagesystem.comment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MinZhi
 * @version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String test(){

        return "hello";
    }
}
