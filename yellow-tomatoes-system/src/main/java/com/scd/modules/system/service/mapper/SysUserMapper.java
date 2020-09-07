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
}
