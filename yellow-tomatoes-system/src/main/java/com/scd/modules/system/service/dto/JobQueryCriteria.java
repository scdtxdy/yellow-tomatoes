package com.scd.modules.system.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class JobQueryCriteria {

    private String name;

    private Boolean enabled;

    private Long deptId;

    private Set<Long> deptIds;

    private List<Timestamp> createTime;
}
