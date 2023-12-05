package com.example.layuimanagesystem.emp.mapper;

import com.example.layuimanagesystem.emp.entity.Emp;
import com.example.layuimanagesystem.emp.vo.EmpQuery;

import java.util.List;

public interface EmpMapper {
    /**
     * 根据parm条件查询empList集合
     * @param parm 分页与查询限制信息
     * @return empList集合
     */
    List<Emp> getEmpList(EmpQuery parm);

    /**
     * 查询empList的数量
     * @param parm 分页与限制条件信息
     * @return empList数量
     */
    Long countEmpList(EmpQuery parm);

    /**
     * 添加emp
     * @param emp
     * @return
     */
    Integer addEmp(Emp emp);

    /**
     * 批量删除emp
     * @param ids
     * @return
     */
    Integer deleteEmpByIds(String ids);

    /**
     * 通过id查找emp
     * @param id
     * @return
     */
    Emp getEmpById(Integer id);

    /**
     * 更新emp信息
     * @param emp
     * @return
     */
    Integer updateEmp(Emp emp);
}
