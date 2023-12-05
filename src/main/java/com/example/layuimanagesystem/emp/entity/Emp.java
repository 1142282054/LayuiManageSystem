package com.example.layuimanagesystem.emp.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MinZhi
 * @version 1.0
 */
@Data
public class Emp implements Serializable {
    private Integer empId;  //员工id
    private String name;    //员工名字
    private String sex;     //性别
    private Integer age;    //年龄
    private Double sal;     //薪资
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;  //生日
    private String address; //地址
    private Integer deptId; //部门id(外键)

    private Dept dept;      //部门信息
}
