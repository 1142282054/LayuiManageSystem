package com.example.layuimanagesystem.comment.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author MinZhi
 * @version 1.0
 */
@Data
public class Page implements Serializable {
    private Integer page;
    private Integer limit;

    public Long getStart(){
        return (page - 1L) * limit;
    }
}
