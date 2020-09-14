package com.scd.modules.system.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class JobDto implements Serializable {

    private Long id;

    private Long sort;

    private String name;

    private Boolean enabled;

    private DeptDto dept;

    private String deptSuperiorName;

    private Timestamp createTime;

//    public JobDto(String name, Boolean enabled) {
//        this.name = name;
//        this.enabled = enabled;
//    }
}
