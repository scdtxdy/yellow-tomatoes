package com.scd.yellowtomatoessystem.modules.system.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scd.yellowtomatoessystem.modules.system.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysUserMapper extends BaseMapper<User> {

}
