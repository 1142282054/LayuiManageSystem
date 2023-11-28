package com.example.layuimanagesystem;

import com.example.layuimanagesystem.emp.entity.Emp;
import com.example.layuimanagesystem.emp.mapper.EmpMapper;
import com.example.layuimanagesystem.emp.vo.EmpQuery;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author MinZhi
 * @version 1.0
 */
@SpringBootTest
public class EmpTest {

    @Resource
    EmpMapper empMapper;

    @Test
    public void mapperSelectTest1(){

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String date1 = ft.format(dNow);

        EmpQuery empQuery = new EmpQuery();
        empQuery.setPage(1);
        empQuery.setLimit(10);
        List<Emp> empList = empMapper.getEmpList(empQuery);
        empList.forEach(System.out::println);

        Long aLong = empMapper.countEmpList(empQuery);
        System.out.println(aLong);
    }

    @Test
    void mapperAddTest(){
        Emp emp = new Emp();
        emp.setAge(18);
        emp.setAddress("新会");
        emp.setName("liang");
        emp.setDeptId(1);
        emp.setSex("男");
        emp.setSal(2000.00);

        Integer integer = empMapper.addEmp(emp);
        System.out.println(integer);
    }
}
