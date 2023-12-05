package com.example.layuimanagesystem.emp.service;

import com.example.layuimanagesystem.emp.entity.Emp;
import com.example.layuimanagesystem.emp.vo.EmpQuery;

import java.util.List;

public interface EmpService {
    /**
     * 通过id获取emp信息
     * @param id id值
     * @return emp信息
     */
    Emp getEmpById(Integer id);

    /**
     * 根据parm值获取emp的信息列表
     * @param parm 包含分页与查询限制条件信息 例:limit,page,name与date信息
     * @return empList集合
     */
    List<Emp> getEmpList(EmpQuery parm) ;

    /**
     * 统计emp集合条数的
     * @param parm
     * @return
     */
    Long countEmpList(EmpQuery parm);

    /**
     * 添加emp操作
     * @param emp emp信息
     * @return 插入成功返回真,失败返回false
     */
    boolean addEmp(Emp emp);

    /**
     * 删除empList信息
     * @param ids 删除的emp集合的id值 例如:1,2,3
     * @return 删除成功返回true,失败返回false
     */
    boolean deleteEmpByIds(String ids);

    /**
     * 更新emp操作
     * @param emp emp的信息
     * @return 更新成功返回true,失败返回false
     */
    boolean updateEmp(Emp emp);
}
