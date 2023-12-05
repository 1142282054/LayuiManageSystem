package com.example.layuimanagesystem.emp.mapper;

import com.example.layuimanagesystem.emp.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MinZhi
 * @version 1.0
 */
public interface DeptMapper {

    /**
     * 根据部门id获取部门信息
     * @param deptId 部门id
     * @return 部门信息
     */
    Dept getDept(@Param("deptId") Integer deptId);

    /**
     * 获取所有部门信息
     * @return 所有部门信息
     */
    List<Dept> getAllDept();
}
