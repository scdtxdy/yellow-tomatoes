package com.scd.modules.system.service.impl;

import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
import com.scd.modules.system.service.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements UserService {

    private final SysUserMapper sysUserMapper;

    public SysUserServiceImpl(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    @Override
    public String getUserName() {
        User user = sysUserMapper.selectById(1);
        return user.getNickName();
    }
}
