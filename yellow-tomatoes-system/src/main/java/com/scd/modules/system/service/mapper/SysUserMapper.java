package com.scd.modules.system.service.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scd.common.mapper.CoreMapper;
import com.scd.modules.system.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysUserMapper extends CoreMapper<User> {

//    @InterceptorIgnore(tenantLine = "1") // 拦截忽略注解
    @Select("SELECT id,nick_name, sex, deleted FROM user")
    List<User> selectPageVo(IPage<User> page);


    /**
     * 根据用户名查询用户信息
     * @param userName 用户名
     */
    @Select("SELECT u.id,u.nick_name,u.sex,u.dept_id,u.enabled,u.create_time,u.phone,u.email,u.job_id ,u.`password` ,u.username,ua.real_name avatar FROM `user` " +
            " u LEFT JOIN user_avatar ua ON u.avatar_id = ua.id  WHERE u.username = #{username}")
    User findByName(String userName);
}
