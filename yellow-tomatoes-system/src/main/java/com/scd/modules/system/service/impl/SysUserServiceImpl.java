package com.scd.modules.system.service.impl;

import cn.hutool.db.PageResult;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scd.common.service.impl.BaseServiceImpl;
import com.scd.modules.system.domain.User;
import com.scd.modules.system.service.UserService;
import com.scd.modules.system.service.dto.UserDto;
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

//    private final IGenerator generator;

    @Autowired
    private SysUserMapper userMapper;

    @Cacheable
    @Override
    public IPage<User> selectPageVo() {
        System.out.println("scd");
        IPage page = new Page<User>(1, 2);
        List<User> users = userMapper.selectPageVo(page);
        page.setRecords(users);
        return page;
    }


    /**
     * 根据用户名查询
     *
     * @param userName /
     * @return /
     */
    @Override
    public UserDto findByName(String userName) {
        User user =  userMapper.findByName(userName);
        //用户所属岗位
//        user.setJob(jobService.getById(user.getJobId()));
        //用户所属部门
//        user.setDept(deptService.getById(user.getDeptId()));
//        return generator.convert(user,UserDto.class);
        UserDto userDto = new UserDto();
        return userDto;
    }

}
