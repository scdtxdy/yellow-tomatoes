package com.scd.modules.system.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scd.common.mapper.CoreMapper;
import com.scd.modules.system.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysUserMapper extends CoreMapper<User> {
}
