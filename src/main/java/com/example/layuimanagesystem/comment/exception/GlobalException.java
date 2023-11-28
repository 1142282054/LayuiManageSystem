package com.example.layuimanagesystem.comment.exception;

import com.example.layuimanagesystem.comment.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author MinZhi
 * @version 1.0
 */
@ControllerAdvice
public class GlobalException {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result globalHandler(Exception e){
        return Result.fail("系统错误：" + e.getMessage());
    }
}
