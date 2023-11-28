package com.example.layuimanagesystem.emp.service;

import com.example.layuimanagesystem.emp.entity.Emp;
import com.example.layuimanagesystem.emp.vo.EmpQuery;

import java.util.List;

public interface EmpService {
    Emp getEmpById(Integer id);

    List<Emp> getEmpList(EmpQuery parm) ;

    Long countEmpList(EmpQuery parm);

    boolean addEmp(Emp emp);

    boolean deleteEmpByIds(String ids);

    boolean updateEmp(Emp emp);
}
