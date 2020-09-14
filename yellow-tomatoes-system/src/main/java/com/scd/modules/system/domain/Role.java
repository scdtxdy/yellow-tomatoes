package com.scd.modules.system.domain;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Data
@TableName("role")
public class Role implements Serializable {

    /** ID */
    @TableId
    private Long id;


    /** 名称 */
    @NotBlank(message = "请填写角色名称")
    private String name;


    /** 备注 */
    private String remark;


    /** 数据权限 */
    private String dataScope;


    /** 角色级别 */
    private Integer level;

    @TableField(exist = false)
    private Set<Menu> menus;

    @TableField(exist = false)
    private Set<Dept> depts;

    /** 创建日期 */
    @TableField(fill= FieldFill.INSERT)
    private Timestamp createTime;


    /** 功能权限 */
    private String permission;


    public void copy(Role source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}
