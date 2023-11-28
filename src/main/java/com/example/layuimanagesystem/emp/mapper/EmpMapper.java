package com.example.layuimanagesystem.emp.mapper;

import com.example.layuimanagesystem.emp.entity.Emp;
import com.example.layuimanagesystem.emp.vo.EmpQuery;

import java.util.List;

public interface EmpMapper {
    List<Emp> getEmpList(EmpQuery parm);

    Long countEmpList(EmpQuery parm);

    Integer addEmp(Emp emp);

    Integer deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    Integer updateEmp(Emp emp);
}
