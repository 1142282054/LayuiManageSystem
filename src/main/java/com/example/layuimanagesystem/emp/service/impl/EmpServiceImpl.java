package com.example.layuimanagesystem.emp.service.impl;

import com.example.layuimanagesystem.emp.entity.Emp;
import com.example.layuimanagesystem.emp.mapper.EmpMapper;
import com.example.layuimanagesystem.emp.service.EmpService;
import com.example.layuimanagesystem.emp.vo.EmpQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author MinZhi
 * @version 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    EmpMapper empMapper;

    @Override
    public Emp getEmpById(Integer id) {
        Emp emp = empMapper.getEmpById(id);
        return emp;
    }

    @Override
    public List<Emp> getEmpList(EmpQuery parm) {
        return empMapper.getEmpList(parm);
    }

    @Override
    public Long countEmpList(EmpQuery parm) {
        return empMapper.countEmpList(parm);
    }

    @Override
    public boolean addEmp(Emp emp) {
        Integer insert = empMapper.addEmp(emp);
        if (insert == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmpByIds(String ids) {
        Integer delete = empMapper.deleteEmpByIds(ids);
        if (delete > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateEmp(Emp emp) {
        Integer update = empMapper.updateEmp(emp);
        if (update == 1){
            return true;
        }
        return false;
    }
}
