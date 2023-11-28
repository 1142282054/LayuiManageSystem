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

    @GetMapping("/table")
    public String table(){
        return "emp/table";
    }

    @ResponseBody
    @GetMapping("/list")
    public Result<Object> getEmpList(EmpQuery parm){
        List<Emp> list = empService.getEmpList(parm);
        Long count = empService.countEmpList(parm);
        return Result.successful(list,count);
    }

    @GetMapping("/add/ui")
    public String addEmpPage(HttpSession session){
        List<Dept> deptList = deptService.getAllDept();
        session.setAttribute("deptList",deptList);
        return "emp/add";
    }

//    resful风格

    @ResponseBody
    @PostMapping("/addEmp")
    public Result<Object> addEmp(Emp emp){
        boolean add =  empService.addEmp(emp);
        if (add){
            return Result.successful("插入成功");
        }

        return Result.fail();
    }

    @ResponseBody
    @DeleteMapping("/{ids}")
    public Result<Object> deleteEmpByIds(@PathVariable("ids") String ids){
        boolean delete = empService.deleteEmpByIds(ids);
        if (delete){
            return Result.successful("删除成功");
        }
        return Result.fail();
    }

    @GetMapping("/{id}")
    public String updateEmpPage(@PathVariable("id") Integer id, Model model){
        Emp emp = empService.getEmpById(id);
        List<Dept> deptList = deptService.getAllDept();
        model.addAttribute("empInfo",emp);
        model.addAttribute("deptList",deptList);
        return "emp/edit";
    }

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
