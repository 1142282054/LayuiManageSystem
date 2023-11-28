package com.example.layuimanagesystem.emp.service.impl;

import com.example.layuimanagesystem.emp.entity.Dept;
import com.example.layuimanagesystem.emp.mapper.DeptMapper;
import com.example.layuimanagesystem.emp.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author MinZhi
 * @version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    DeptMapper deptMapper;

    @Override
    public List<Dept> getAllDept() {
        List<Dept> deptList = deptMapper.getAllDept();
        return deptList;
    }
}
