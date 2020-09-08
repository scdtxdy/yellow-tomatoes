package com.scd.modules.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scd.common.service.impl.BaseServiceImpl;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
import com.scd.modules.system.service.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, User> implements UserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public String getUserName() {
        User user = sysUserMapper.selectById(1l);
        return user.getNickName();
    }

}
