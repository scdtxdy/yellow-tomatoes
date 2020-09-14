package com.scd.modules.system.service.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Data
public class DeptQueryCriteria {

    private Set<Long> ids;

    private String name;

    private Boolean enabled;

    private Long pid;

    private List<Timestamp> createTime;
}
