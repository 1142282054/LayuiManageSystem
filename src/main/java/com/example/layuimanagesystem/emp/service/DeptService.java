package com.example.layuimanagesystem.emp.service;

import com.example.layuimanagesystem.emp.entity.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 获取所有部门信息
     * @return 所有部门信息
     */
    List<Dept> getAllDept();
}
