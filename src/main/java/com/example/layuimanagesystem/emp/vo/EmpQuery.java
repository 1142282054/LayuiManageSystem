package com.example.layuimanagesystem.emp.vo;

import com.example.layuimanagesystem.comment.vo.Page;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * @author MinZhi
 * @version 1.0
 */
@Data
public class EmpQuery extends Page {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
}
