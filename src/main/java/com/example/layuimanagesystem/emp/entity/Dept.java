package com.example.layuimanagesystem.emp.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author MinZhi
 * @version 1.0
 */@Data
public class Dept implements Serializable {
    private Integer deptId;     //部门id
    private String deptName;    //部门名称
}
