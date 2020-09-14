package com.scd.modules.system.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.dozer.Mapping;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Data
public class UserDto implements Serializable {


    @ApiModelProperty(hidden = true)
    private Long id;

    @Mapping("nickName")//指定对应字段
    private String username;

    private String nickName;

    private String sex;

    private String avatar;

    private String email;

    private String phone;

    private Boolean enabled;

    @JsonIgnore
    private String password;

    private Timestamp lastPasswordResetTime;

    @ApiModelProperty(hidden = true)
    private Set<RoleSmallDto> roles;

    @ApiModelProperty(hidden = true)
    private JobSmallDto job;

    private DeptSmallDto dept;

    private Long deptId;

    private Timestamp createTime;
}
