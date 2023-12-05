package com.example.layuimanagesystem.emp.controller;

import com.example.layuimanagesystem.comment.vo.Result;
import com.example.layuimanagesystem.emp.entity.Dept;
import com.example.layuimanagesystem.emp.entity.Emp;
import com.example.layuimanagesystem.emp.service.DeptService;
import com.example.layuimanagesystem.emp.service.EmpService;
import com.example.layuimanagesystem.emp.vo.EmpQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author MinZhi
 * @version 1.0
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Resource
    EmpService empService;

    @Resource
    DeptService deptService;

//页面跳转

    @GetMapping("/table")
    public String table(){
        return "emp/table";
    }

    /**
     * 获取添加emp页面
     * 1.获取所有部门的信息
     * 2.把部门信息存储到session用于部门信息的数据回显
     * 3.跳转页面
     * @param session
     * @return
     */
    @GetMapping("/add/ui")
    public String addEmpPage(HttpSession session){
        List<Dept> deptList = deptService.getAllDept();
        session.setAttribute("deptList",deptList);
        return "emp/add";
    }

    /**
     * 获取更新页面
     * 1.根据id值查询emp的信息
     * 2.把emp信息存储到model域,用于数据回显
     * 3.跳转页面
     * @param id 要更新emp的id
     * @param model
     * @return
     */
    @GetMapping("/{id}")
    public String updateEmpPage(@PathVariable("id") Integer id, Model model){
        Emp emp = empService.getEmpById(id);
        List<Dept> deptList = deptService.getAllDept();
        model.addAttribute("empInfo",emp);
        model.addAttribute("deptList",deptList);
        return "emp/edit";
    }

//Resful风格,对emp的各种操作

    /**
     * 根据查询条件获取empList信息
     * @param parm 分页与限制条件
     * @return 查询信息
     */
    @ResponseBody
    @GetMapping("/list")
    public Result<Object> getEmpList(EmpQuery parm){
        List<Emp> list = empService.getEmpList(parm);
        Long count = empService.countEmpList(parm);
        return Result.successful(list,count);
    }

    /**
     * 对emp的添加操作
     * @param emp emp信息
     * @return 添加确认信息，code=1成功，code=0失败
     */
    @ResponseBody
    @PostMapping("/addEmp")
    public Result<Object> addEmp(Emp emp){
        boolean add =  empService.addEmp(emp);
        if (add){
            return Result.successful("插入成功");
        }

        return Result.fail();
    }

    /**
     * 对emp的删除操作
     * @param ids 删除的emp的id字符串 例:1,2,3
     * @return 删除确认信息
     */
    @ResponseBody
    @DeleteMapping("/{ids}")
    public Result<Object> deleteEmpByIds(@PathVariable("ids") String ids){
        boolean delete = empService.deleteEmpByIds(ids);
        if (delete){
            return Result.successful("删除成功");
        }
        return Result.fail();
    }



    /**
     *
     * @param emp
     * @return
     */
    @ResponseBody
    @PutMapping("")
    public Result updateEmp(Emp emp){
        System.out.println(emp);
        boolean update = empService.updateEmp(emp);
        if (update){
            return Result.successful("更新成功");
        }
        return Result.fail();
    }


}
