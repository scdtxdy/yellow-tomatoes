package com.scd.modules.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scd.common.service.impl.BaseServiceImpl;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
import com.scd.modules.system.service.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
@CacheConfig(cacheNames = "user")
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, User> implements UserService{

    @Autowired
    private SysUserMapper sysUserMapper;

//    @Cacheable
//    @Override
//    public Page<User> selectPageVo() {
//        System.out.println("scd");
//        Page page = new Page<User>(1, 2);
//        List<User> users = sysUserMapper.selectPageVo(page);
//        page.setRecords(users);
//        return page;
//    }

    @Cacheable
    @Override
    public List<User>  selectPageVo() {
        System.out.println("scd");
        Page page = new Page<User>(1, 2);
        List<User> users = sysUserMapper.selectPageVo(page);
        return users;
    }

}
