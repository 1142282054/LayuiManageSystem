package com.example.layuimanagesystem.emp.mapper;

import com.example.layuimanagesystem.emp.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MinZhi
 * @version 1.0
 */
public interface DeptMapper {

    Dept getDept(@Param("deptId") Integer deptId);

    List<Dept> getAllDept();
}
