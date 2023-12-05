package com.example.layuimanagesystem.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MinZhi
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;         //用户id
    private String username;    //用户名
    private String password;    //密码
    private String chName;      //中文名
}
