package com.scd.modules.system.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.scd.modules.system.enums.SexEnum;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("user")
public class User {
    /** 系统用户ID */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    /** 头像 */
    private Long avatarId;


    /** 邮箱 */
    private String email;


    /** 状态：1启用、0禁用 */
    private Boolean enabled;

    /** 用户头像 */
    @TableField(exist = false)
    private String avatar;

    /** 岗位名称 */
    private Long jobId;


    /** 创建日期 */
    @TableField(fill= FieldFill.INSERT)
    private Timestamp createTime;


    /** 最后修改密码的日期 */
    private Timestamp lastPasswordResetTime;


    /** 昵称 */
    private String nickName;


    /** 性别 */
    private SexEnum sex;

    public @interface Update {}
}
